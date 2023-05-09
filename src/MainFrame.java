import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    InputPanel testtomegPanel;
    InputPanel magassagPanel;
    InputPanel indexPanel;
    JPanel buttonPanel;
    JButton calcButton;

    private String text;

    public MainFrame(String text) {
        this.text = text;
        this.initComponent();
        this.addComponents();
        this.handleEvent();
        this.setFrame();

    }

    private void initComponent() {
        this.testtomegPanel = new InputPanel("Testtömeg (kg)");
        this.magassagPanel = new InputPanel("Testmagasság (m)");
        this.buttonPanel= new JPanel();
        this.calcButton= new JButton("Számolj");
        this.indexPanel = new InputPanel("Testtömeg index");
    }

    private void addComponents() {
        this.add(this.testtomegPanel);
        this.add(this.magassagPanel);
        this.add(this.buttonPanel);
        this.buttonPanel.add(calcButton);
        this.add(this.indexPanel);
    }

    private void handleEvent(){
        this.calcButton.addActionListener( e -> {
            startCalc();
        });
    }

    private void startCalc(){
        String tomegStr = this.testtomegPanel.getValue();
        if(!this.checkInput(tomegStr)){
            JOptionPane .showMessageDialog(this, "A tömeg hibás, csak számjegy!");
            return;
        }
        double tomeg = Double.parseDouble(tomegStr);
        String magassagStr=this.magassagPanel.getValue();
        if(!this.checkInput(magassagStr)){
            JOptionPane .showMessageDialog(this, "A magasság hibás, csak számjegy!");
            return;
        }
        double magassag = Double.parseDouble(magassagStr);
        Double testTomegIndex = this.calcIndex(tomeg, magassag);
        this.indexPanel.setValue(testTomegIndex.toString());
    }

    public double calcIndex(double weight, double height){

        return weight/(Math.pow(height,2));
    } 

    public boolean checkInput(String input){
        boolean ok = false;
        if(input.matches("[0-9.]+")){
            ok= true;
        }
        return ok;
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        //this.setSize(400, 300);
        
        this.setTitle(text);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
    }
}

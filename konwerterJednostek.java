/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rats
 */
public class konwerterJednostek extends JFrame {

    /**
     * Creates new form konwerterJednostek
     */
    public konwerterJednostek() {
        
        super("Converter of Units");
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("rat.jpg"));
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        meterCheckBox = new javax.swing.JCheckBox();
        kilometerCheckBox = new javax.swing.JCheckBox();
        centimeterCheckBox = new javax.swing.JCheckBox();
        cmTextField = new javax.swing.JTextField();
        cmTextField.setEnabled(false);
        meterTextField = new javax.swing.JTextField();
        meterTextField.setEnabled(false);
        kmTextField = new javax.swing.JTextField();
        kmTextField.setEnabled(false);
        lengthLabel = new javax.swing.JLabel();
        inchCheckBox = new javax.swing.JCheckBox();
        footCheckBox = new javax.swing.JCheckBox();
        yardCheckBox = new javax.swing.JCheckBox();
        mileCheckBox = new javax.swing.JCheckBox();
        leagueCheckBox = new javax.swing.JCheckBox();
        inchTextField = new javax.swing.JTextField();
        inchTextField.setEnabled(false);
        footTextField = new javax.swing.JTextField();
        footTextField.setEnabled(false);
        yardTextField = new javax.swing.JTextField();
        yardTextField.setEnabled(false);
        mileTextField = new javax.swing.JTextField();
        mileTextField.setEnabled(false);
        leagueTextField = new javax.swing.JTextField();
        leagueTextField.setEnabled(false);
        volumeLabel = new javax.swing.JLabel();
        mlCheckBox = new javax.swing.JCheckBox();
        literCheckBox = new javax.swing.JCheckBox();
        flOunceCheckBox = new javax.swing.JCheckBox();
        mlTextField = new javax.swing.JTextField();
        mlTextField.setEnabled(false);
        literTextField = new javax.swing.JTextField();
        literTextField.setEnabled(false);
        flOunceTextField = new javax.swing.JTextField();
        flOunceTextField.setEnabled(false);
        cupCheckBox = new javax.swing.JCheckBox();
        pintCheckBox = new javax.swing.JCheckBox();
        quartCheckBox = new javax.swing.JCheckBox();
        galonCheckBox = new javax.swing.JCheckBox();
        cupTextField = new javax.swing.JTextField();
        cupTextField.setEnabled(false);
        pintTextField = new javax.swing.JTextField();
        pintTextField.setEnabled(false);
        quartTextField = new javax.swing.JTextField();
        quartTextField.setEnabled(false);
        galonTextField = new javax.swing.JTextField();
        galonTextField.setEnabled(false);
        weigthLabel = new javax.swing.JLabel();
        gramCheckBox = new javax.swing.JCheckBox();
        kgCheckBox = new javax.swing.JCheckBox();
        gramTextField = new javax.swing.JTextField();
        gramTextField.setEnabled(false);
        kgTextField = new javax.swing.JTextField();
        kgTextField.setEnabled(false);
        ounceCheckBox = new javax.swing.JCheckBox();
        poundCheckBox = new javax.swing.JCheckBox();
        stoneCheckBox = new javax.swing.JCheckBox();
        ukTonCheckBox = new javax.swing.JCheckBox();
        celsiusCheckBox = new javax.swing.JCheckBox();
        temperatureLabel = new javax.swing.JLabel();
        celsiusTextField = new javax.swing.JTextField();
        celsiusTextField.setEnabled(false);
        ounceTextField = new javax.swing.JTextField();
        ounceTextField.setEnabled(false);
        poundTextField = new javax.swing.JTextField();
        poundTextField.setEnabled(false);
        ukTonTextField = new javax.swing.JTextField();
        ukTonTextField.setEnabled(false);
        stoneTextField = new javax.swing.JTextField();
        stoneTextField.setEnabled(false);
        rankinCheckBox = new javax.swing.JCheckBox();
        fahrCheckBox = new javax.swing.JCheckBox();
        rankinTextField = new javax.swing.JTextField();
        rankinTextField.setEnabled(false);
        fahrTextField = new javax.swing.JTextField();
        fahrTextField.setEnabled(false);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        temperatureToSIbutton = new javax.swing.JButton();
        temperatureToImpUnitsButton = new javax.swing.JButton();
        weightToImpUNits = new javax.swing.JButton();
        weightToSIunits = new javax.swing.JButton();
        volumeToImpUnits = new javax.swing.JButton();
        volumeToSIunits = new javax.swing.JButton();
        lengthToImpUnits = new javax.swing.JButton();
        lengthToSIunits = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(60, 22));

        meterCheckBox.setText("Meter");

        kilometerCheckBox.setText("Kilometer");

        centimeterCheckBox.setText("Centimeter");
        

        cmTextField.setMinimumSize(new java.awt.Dimension(60, 22));
        

        lengthLabel.setText("Length");

        inchCheckBox.setText("inch");

        footCheckBox.setText("Foot");

        yardCheckBox.setText("Yard");
        
        
       
        

        mileCheckBox.setText("Mile");

        leagueCheckBox.setText("League");

        inchTextField.setColumns(5);
        inchTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        footTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        yardTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mileTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        leagueTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        volumeLabel.setText("Volume");

        mlCheckBox.setText("Mililiter");
        mlCheckBox.setPreferredSize(new java.awt.Dimension(60, 25));

        literCheckBox.setText("Liter");

        flOunceCheckBox.setText("Fluid Ounce");

        flOunceTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cupCheckBox.setText("Cup");

        pintCheckBox.setText("Pint");

        quartCheckBox.setText("Quart");
       

        galonCheckBox.setText("Galon");

        cupTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pintTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        quartTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        galonTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        weigthLabel.setText("Weight");

        gramCheckBox.setText("Gram");

        kgCheckBox.setText("Kilogram");
        

        ounceCheckBox.setText("Ounce");

        poundCheckBox.setText("Pound");

        stoneCheckBox.setText("Stone");

       ukTonCheckBox.setText("UKton");
      

        celsiusCheckBox.setText("Celsius");

        temperatureLabel.setText("Temperature");

        ounceTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
       

        poundTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ukTonTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
       
        stoneTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        

        rankinCheckBox.setText("Rankin");

        fahrCheckBox.setText("Fahrenheit");

        jLabel5.setText("SI Units");

        jLabel6.setText("Imperial Units");

        temperatureToSIbutton.setText("temperature to SI units");
        temperatureToSIbutton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                temperatureToSIunitsButonActionPerformed(evt);
            }
        });

        temperatureToImpUnitsButton.setText("temperature to Imperial units");
        temperatureToImpUnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureToImpUnitsButtonActionPerformed(evt);
            }
        });

        weightToImpUNits.setText("Weight to Imperial units");

        weightToSIunits.setText("Weight to SI units");

        volumeToImpUnits.setText("Volume to Imperial units");

        volumeToSIunits.setText("Volume to SI units");

        lengthToImpUnits.setText("Length To Imperial units");

        lengthToSIunits.setText("Length to SI units");
        
        
        // set Text Fields enabled 
        
        centimeterCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           cmTextField.setEnabled(true);
        });
       
        yardCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           yardTextField.setEnabled(true);
        });
      
        quartCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           quartTextField.setEnabled(true);
        });
      
        kgCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           kgTextField.setEnabled(true);
        });
      
        ukTonCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           ukTonTextField.setEnabled(true);
        });
      
        stoneCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           stoneTextField.setEnabled(true);
        });
        inchCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           inchTextField.setEnabled(true);
        });
        footCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           footTextField.setEnabled(true);
        });
        mileCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           mileTextField.setEnabled(true);
        });
        leagueCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           leagueTextField.setEnabled(true);
        });
        meterCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           meterTextField.setEnabled(true);
        });
        kilometerCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           kmTextField.setEnabled(true);
        });
        inchCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           inchTextField.setEnabled(true);
        });
        mlCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           mlTextField.setEnabled(true);
        });
        literCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           literTextField.setEnabled(true);
        });
        flOunceCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           flOunceTextField.setEnabled(true);
        });
        cupCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           cupTextField.setEnabled(true);
        });
        pintCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           pintTextField.setEnabled(true);
        });
        galonCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           galonTextField.setEnabled(true);
        });
        gramCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           gramTextField.setEnabled(true);
        });
        ounceCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           ounceTextField.setEnabled(true);
        });
        poundCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           poundTextField.setEnabled(true);
        });
        celsiusCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           celsiusTextField.setEnabled(true);
        });
        fahrCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           fahrTextField.setEnabled(true);
        });
        rankinCheckBox.addActionListener((java.awt.event.ActionEvent evt) -> {
           rankinTextField.setEnabled(true);
        });
        
       // button's ActionListeners
        lengthToImpUnits.addActionListener((java.awt.event.ActionEvent evt) -> {
           lengthToImpUnitsButtonActionPerformed(evt);
        }); 
        
        weightToImpUNits.addActionListener((ActionEvent evt)->{
           weightToImpUnitsButtonActionPerformed(evt);
        
    });
        weightToSIunits.addActionListener((ActionEvent evt)->{
           weightToSIunitsButtonActionPerformed(evt);
        
    });
        volumeToSIunits.addActionListener((ActionEvent evt)->{
           volumeToSIunitsButtonActionPerformed(evt);
        
    });
        volumeToImpUnits.addActionListener((ActionEvent evt)->{
           volumeToImpUnitsButtonActionPerformed(evt);
        
    });
        lengthToImpUnits.addActionListener((ActionEvent evt)->{
           lengthToImpUnitsButtonActionPerformed(evt);
        
    });
        
        lengthToSIunits.addActionListener((ActionEvent evt)->{
           lengthToSIUnitsButtonActionPerformed(evt);
        
    });
        
        
      
        
        
        
        // Text Fields Listeners (to avoid input wrong data)
        
        inchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        footTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        yardTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        mileTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        leagueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        flOunceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        cupTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        quartTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        pintTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        galonTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        ounceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        poundTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        stoneTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        ukTonTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        celsiusTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        fahrTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        rankinTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        cmTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        kmTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        meterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        mlTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        literTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        kgTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        gramTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        
    
        
       
        // Group Layout 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(temperatureToImpUnitsButton)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(centimeterCheckBox)
                                            .addComponent(meterCheckBox)
                                            .addComponent(kilometerCheckBox))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(meterTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(kmTextField)
                                            .addComponent(cmTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(gramTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(gramCheckBox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kgCheckBox)
                                            .addComponent(celsiusCheckBox))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(celsiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(temperatureToSIbutton))))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(weightToSIunits)
                                .addGap(117, 117, 117)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(footTextField)
                                    .addComponent(inchTextField)
                                    .addComponent(yardTextField)
                                    .addComponent(mileTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leagueCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(leagueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stoneCheckBox)
                                    .addComponent(ukTonCheckBox)
                                    .addComponent(poundCheckBox)
                                    .addComponent(ounceCheckBox)
                                    .addComponent(weightToImpUNits))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ounceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ukTonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inchCheckBox)
                                    .addComponent(footCheckBox)
                                    .addComponent(yardCheckBox)
                                    .addComponent(mileCheckBox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fahrCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(fahrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rankinCheckBox)
                                        .addGap(47, 47, 47)
                                        .addComponent(rankinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lengthToImpUnits))
                                .addGap(49, 49, 49))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temperatureLabel)
                            .addComponent(lengthLabel)
                            .addComponent(weigthLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(volumeLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(literCheckBox)
                                    .addComponent(mlCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(literTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lengthToSIunits)
                                    .addComponent(volumeToSIunits))
                                .addGap(122, 122, 122)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flOunceCheckBox)
                            .addComponent(cupCheckBox)
                            .addComponent(pintCheckBox)
                            .addComponent(quartCheckBox)
                            .addComponent(galonCheckBox)
                            .addComponent(volumeToImpUnits))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pintTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flOunceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(galonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ukTonTextField, celsiusTextField, cmTextField, cupTextField, fahrTextField, flOunceTextField, footTextField, galonTextField, gramTextField, inchTextField, rankinTextField, kgTextField, kmTextField, leagueTextField, literTextField, meterTextField, mileTextField, mlTextField, ounceTextField, pintTextField, poundTextField, quartTextField, stoneTextField, yardTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {centimeterCheckBox, kilometerCheckBox, literCheckBox, meterCheckBox, mlCheckBox});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {temperatureToImpUnitsButton, temperatureToSIbutton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lengthLabel))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(centimeterCheckBox)
                            .addComponent(cmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inchCheckBox)
                            .addComponent(inchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meterCheckBox)
                            .addComponent(meterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(footCheckBox)
                            .addComponent(footTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kilometerCheckBox)
                            .addComponent(kmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yardCheckBox)
                            .addComponent(yardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mileCheckBox)
                            .addComponent(mileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leagueCheckBox)
                            .addComponent(leagueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lengthToImpUnits)
                        .addComponent(lengthToSIunits)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mlCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flOunceCheckBox)
                    .addComponent(flOunceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(literCheckBox)
                    .addComponent(literTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cupCheckBox)
                    .addComponent(cupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pintCheckBox)
                    .addComponent(pintTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quartCheckBox))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(galonCheckBox)
                    .addComponent(galonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumeToImpUnits)
                    .addComponent(volumeToSIunits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weigthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gramCheckBox)
                            .addComponent(gramTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ounceCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kgCheckBox)
                            .addComponent(kgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poundCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ukTonCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightToImpUNits)
                            .addComponent(weightToSIunits)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ounceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(poundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ukTonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temperatureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celsiusCheckBox)
                    .addComponent(celsiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankinCheckBox)
                    .addComponent(rankinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrCheckBox)
                    .addComponent(fahrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureToSIbutton)
                    .addComponent(temperatureToImpUnitsButton))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ukTonTextField, celsiusTextField, cmTextField, cupTextField, fahrTextField, flOunceTextField, footTextField, galonTextField, gramTextField, inchTextField, rankinTextField, kgTextField, kmTextField, leagueTextField, literTextField, meterTextField, mileTextField, mlTextField, ounceTextField, pintTextField, poundTextField, quartTextField, stoneTextField, yardTextField});

        pack();
    }// </editor-fold>
    
    
 
    
    private void lengthToImpUnitsButtonActionPerformed (ActionEvent evt){
        if (meterCheckBox.isSelected()){
            double meter = Double.parseDouble(meterTextField.getText());
            
            if (inchCheckBox.isSelected()){
                inchTextField.setText( Double.toString(convertToImpUnits.meterToInch(meter)));
            }
           else if (footCheckBox.isSelected()){
                footTextField.setText( Double.toString(convertToImpUnits.meterToFoot(meter)));
            }
            else if (yardCheckBox.isSelected()){
                yardTextField.setText( Double.toString(convertToImpUnits.meterToYard(meter)));
            }
            else if (mileCheckBox.isSelected()){
                mileTextField.setText( Double.toString(convertToImpUnits.meterToMile(meter)));
            }
            else if (leagueCheckBox.isSelected()){
                leagueTextField.setText( Double.toString(convertToImpUnits.meterToLeague(meter)));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
            
        }
        else if (kilometerCheckBox.isSelected()){
            double km = Double.parseDouble(kmTextField.getText());
            double meter = km*1000;
            
            if (inchCheckBox.isSelected()){
                inchTextField.setText( Double.toString(convertToImpUnits.meterToInch(meter)));
            }
           else if (footCheckBox.isSelected()){
                footTextField.setText( Double.toString(convertToImpUnits.meterToFoot(meter)));
            }
            else if (yardCheckBox.isSelected()){
                yardTextField.setText( Double.toString(convertToImpUnits.meterToYard(meter)));
            }
            else if (mileCheckBox.isSelected()){
                mileTextField.setText( Double.toString(convertToImpUnits.meterToMile(meter)));
            }
            else if (leagueCheckBox.isSelected()){
                leagueTextField.setText( Double.toString(convertToImpUnits.meterToLeague(meter)));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
            
        }
        else if (centimeterCheckBox.isSelected()){
            double cm = Double.parseDouble(cmTextField.getText());
            double meter = cm/100;
            if (inchCheckBox.isSelected()){
                inchTextField.setText( Double.toString(convertToImpUnits.meterToInch(meter)));
            }
           else if (footCheckBox.isSelected()){
                footTextField.setText( Double.toString(convertToImpUnits.meterToFoot(meter)));
            }
            else if (yardCheckBox.isSelected()){
                yardTextField.setText( Double.toString(convertToImpUnits.meterToYard(meter)));
            }
            else if (mileCheckBox.isSelected()){
                mileTextField.setText( Double.toString(convertToImpUnits.meterToMile(meter)));
            }
            else if (leagueCheckBox.isSelected()){
                leagueTextField.setText( Double.toString(convertToImpUnits.meterToLeague(meter)));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
            
        }
        else {
            JOptionPane.showConfirmDialog(null, "Please choose SI Unit you want convert to Imperial Unit");
        }
    }
    
    private void lengthToSIUnitsButtonActionPerformed(ActionEvent evt){
         if (inchCheckBox.isSelected()){
            double inch = Double.parseDouble(inchTextField.getText());
            
            if (meterCheckBox.isSelected()){
                meterTextField.setText( Double.toString(convertToSIUnits.inchToMeter(inch)));
            }
           else if (kilometerCheckBox.isSelected()){
               double km = convertToSIUnits.inchToMeter(inch)/1000;
                kmTextField.setText( Double.toString(km));
            }
            else if (centimeterCheckBox.isSelected()){
                double cm = convertToSIUnits.inchToMeter(inch)*100;
                cmTextField.setText( Double.toString(cm));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
            
        }
        else if (footCheckBox.isSelected()){
            double foot = Double.parseDouble(footTextField.getText());
            
            if (meterCheckBox.isSelected()){
                meterTextField.setText( Double.toString(convertToSIUnits.footToMeter(foot)));
            }
           else if (kilometerCheckBox.isSelected()){
               double km = convertToSIUnits.footToMeter(foot)/1000;
                kmTextField.setText( Double.toString(km));
            }
            else if (centimeterCheckBox.isSelected()){
                double cm = convertToSIUnits.footToMeter(foot)*100;
                cmTextField.setText( Double.toString(cm));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
            
        
            
        }
        else if (yardCheckBox.isSelected()){
            double yard = Double.parseDouble(yardTextField.getText());
            
            if (meterCheckBox.isSelected()){
                meterTextField.setText( Double.toString(convertToSIUnits.yardToMeter(yard)));
            }
           else if (kilometerCheckBox.isSelected()){
               double km = convertToSIUnits.yardToMeter(yard)/1000;
                kmTextField.setText( Double.toString(km));
            }
            else if (centimeterCheckBox.isSelected()){
                double cm = convertToSIUnits.yardToMeter(yard)*100;
                cmTextField.setText( Double.toString(cm));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        }
            
        else if (mileCheckBox.isSelected()){
            double mile = Double.parseDouble(mileTextField.getText());
            
            if (meterCheckBox.isSelected()){
                meterTextField.setText( Double.toString(convertToSIUnits.mileToMeter(mile)));
            }
           else if (kilometerCheckBox.isSelected()){
               double km = convertToSIUnits.mileToMeter(mile)/1000;
                kmTextField.setText( Double.toString(km));
            }
            else if (centimeterCheckBox.isSelected()){
                double cm = convertToSIUnits.mileToMeter(mile)*100;
                cmTextField.setText( Double.toString(cm));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        }
           else if (leagueCheckBox.isSelected()){
            double league = Double.parseDouble(leagueTextField.getText());
            
            if (meterCheckBox.isSelected()){
                meterTextField.setText( Double.toString(convertToSIUnits.leagueToMeter(league)));
            }
           else if (kilometerCheckBox.isSelected()){
               double km = convertToSIUnits.leagueToMeter(league)/1000;
                kmTextField.setText( Double.toString(km));
            }
            else if (centimeterCheckBox.isSelected()){
                double cm = convertToSIUnits.leagueToMeter(league)*100;
                cmTextField.setText( Double.toString(cm));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        }
            
        
        else {
            JOptionPane.showConfirmDialog(null, "Please choose SI Unit you want convert to Imperial Unit");
        }
                }
    
     private void weightToImpUnitsButtonActionPerformed (ActionEvent evt){
        if (gramCheckBox.isSelected()){
            double gram = Double.parseDouble(gramTextField.getText());
            double kg = gram/1000;
            if (ounceCheckBox.isSelected()){
                
                ounceTextField.setText( Double.toString(convertToImpUnits.kgToOunce(kg)));
            }
           else if (poundCheckBox.isSelected()){
                poundTextField.setText( Double.toString(convertToImpUnits.kgToPound(kg)));
            }
            else if (stoneCheckBox.isSelected()){
                stoneTextField.setText( Double.toString(convertToImpUnits.kgToStone(kg)));
            }
            else if (ukTonCheckBox.isSelected()){
                ukTonTextField.setText( Double.toString(convertToImpUnits.kgToUKton(kg)));
            }
          else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
            
        }
        else if (kgCheckBox.isSelected()){
            double kg = Double.parseDouble(kgTextField.getText());
            if (ounceCheckBox.isSelected()){
                
                ounceTextField.setText( Double.toString(convertToImpUnits.kgToOunce(kg)));
            }
           else if (poundCheckBox.isSelected()){
                poundTextField.setText( Double.toString(convertToImpUnits.kgToPound(kg)));
            }
            else if (stoneCheckBox.isSelected()){
                stoneTextField.setText( Double.toString(convertToImpUnits.kgToStone(kg)));
            }
            else if (ukTonCheckBox.isSelected()){
                ukTonTextField.setText( Double.toString(convertToImpUnits.kgToUKton(kg)));
            }
          else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
        }
        
        else {
            JOptionPane.showConfirmDialog(null, "Please choose SI Unit you want convert to Imperial Unit");
        }
    }
    
    private void weightToSIunitsButtonActionPerformed(ActionEvent evt){
           if (ounceCheckBox.isSelected()){
            double ounce = Double.parseDouble(ounceTextField.getText());
            
            if (kgCheckBox.isSelected()){
                kgTextField.setText( Double.toString(convertToSIUnits.ounceToKg(ounce)));
            }
           else if (gramCheckBox.isSelected()){
               double gram = convertToSIUnits.ounceToKg(ounce)*1000;
                kmTextField.setText( Double.toString(gram));
            }
           
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
            
        }
        else if (poundCheckBox.isSelected()){
            double pound = Double.parseDouble(poundTextField.getText());
            
           if (kgCheckBox.isSelected()){
                kgTextField.setText( Double.toString(convertToSIUnits.poundToKg(pound)));
            }
           else if (gramCheckBox.isSelected()){
               double gram = convertToSIUnits.poundToKg(pound)*1000;
                kmTextField.setText( Double.toString(gram));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
            
        
            
        }
        else if (stoneCheckBox.isSelected()){
            double stone = Double.parseDouble(stoneTextField.getText());
            
            if (kgCheckBox.isSelected()){
                kgTextField.setText( Double.toString(convertToSIUnits.StonetToKg(stone)));
            }
           else if (gramCheckBox.isSelected()){
               double gram = convertToSIUnits.StonetToKg(stone)*1000;
                kmTextField.setText( Double.toString(gram));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        }
            
        else if (ukTonCheckBox.isSelected()){
            double ukTon = Double.parseDouble(ukTonTextField.getText());
            
            if (kgCheckBox.isSelected()){
                kgTextField.setText( Double.toString(convertToSIUnits.UKtonToKg(ukTon)));
            }
           else if (gramCheckBox.isSelected()){
               double gram = convertToSIUnits.UKtonToKg(ukTon)*1000;
                kmTextField.setText( Double.toString(gram));
            }
           
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        }
          
        else {
            JOptionPane.showConfirmDialog(null, "Please choose SI Unit you want convert to Imperial Unit");
        }
                
    }
    
    private void volumeToImpUnitsButtonActionPerformed (ActionEvent evt){
        if (mlCheckBox.isSelected()){
            double ml = Double.parseDouble(mlTextField.getText());
            if (flOunceCheckBox.isSelected()){
                flOunceTextField.setText(Double.toString(convertToImpUnits.mlToFluidOunce(ml)));
                }
            else if (cupCheckBox.isSelected()){
                cupTextField.setText(Double.toString(convertToImpUnits.mlToCup(ml)));
            }
            else if (quartCheckBox.isSelected()){
                quartTextField.setText(Double.toString(convertToImpUnits.mlToQuart(ml)));
             
            }
            else if (pintCheckBox.isSelected()){
                pintTextField.setText(Double.toString(convertToImpUnits.mlToPint(ml)));
            
            }
            else if (galonCheckBox.isSelected()){
                galonTextField.setText(Double.toString(convertToImpUnits.mlToGalon(ml)));
            
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
        }
        if (literCheckBox.isSelected()){
            double liter = Double.parseDouble(literTextField.getText());
            double ml = liter*1000;
            if (flOunceCheckBox.isSelected()){
                flOunceTextField.setText(Double.toString(convertToImpUnits.mlToFluidOunce(ml)));
                }
            else if (cupCheckBox.isSelected()){
                cupTextField.setText(Double.toString(convertToImpUnits.mlToCup(ml)));
            }
            else if (quartCheckBox.isSelected()){
                quartTextField.setText(Double.toString(convertToImpUnits.mlToQuart(ml)));
             
            }
            else if (pintCheckBox.isSelected()){
                pintTextField.setText(Double.toString(convertToImpUnits.mlToPint(ml)));
            
            }
            else if (galonCheckBox.isSelected()){
                galonTextField.setText(Double.toString(convertToImpUnits.mlToGalon(ml)));
            
            }
             else{
                JOptionPane.showConfirmDialog(null,"Please choose Imperial Unit you want convert to ");
            }
        }
        else {
            JOptionPane.showConfirmDialog(null, "Please choose SI Unit you want convert to Imperial Unit");
        }
    }
    
    private void volumeToSIunitsButtonActionPerformed (ActionEvent evt){
       if (flOunceCheckBox.isSelected()){
            double flOunce = Double.parseDouble(flOunceTextField.getText());
            
            if (mlCheckBox.isSelected()){
                mlTextField.setText( Double.toString(convertToSIUnits.fluidOunceToMl(flOunce)));
            }
            else if (literCheckBox.isSelected()){
               
               double ml = convertToSIUnits.fluidOunceToMl(flOunce)/1000;
                literTextField.setText( Double.toString(ml));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
            
        }
        else if (cupCheckBox.isSelected()){
            double cup = Double.parseDouble(cupTextField.getText());
            
          if (mlCheckBox.isSelected()){
                mlTextField.setText( Double.toString(convertToSIUnits.cupToMl(cup)));
            }
            else if (literCheckBox.isSelected()){
               
               double ml = convertToSIUnits.cupToMl(cup)/1000;
                literTextField.setText( Double.toString(ml));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        
            
        }
        else if (quartCheckBox.isSelected()){
            double quart = Double.parseDouble(stoneTextField.getText());
            
            if (mlCheckBox.isSelected()){
                mlTextField.setText( Double.toString(convertToSIUnits.quartToML(quart)));
            }
            else if (literCheckBox.isSelected()){
               
               double ml = convertToSIUnits.quartToML(quart)/1000;
                literTextField.setText( Double.toString(ml));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
        }
            
        else if (galonCheckBox.isSelected()){
            double galon = Double.parseDouble(galonTextField.getText());
            
            if (mlCheckBox.isSelected()){
                mlTextField.setText( Double.toString(convertToSIUnits.galonToMl(galon)));
            }
            else if (literCheckBox.isSelected()){
               
               double ml = convertToSIUnits.galonToMl(galon)/1000;
                literTextField.setText( Double.toString(ml));
            }
            else{
                JOptionPane.showConfirmDialog(null,"Please choose SI Unit you want convert to ");
            }
           
            
        }
          
        else {
            JOptionPane.showConfirmDialog(null, "Please choose SI Unit you want convert to Imperial Unit");
        }
                
     
    }
    
      private void temperatureToSIunitsButonActionPerformed(ActionEvent evt){
          if (fahrCheckBox.isSelected()){
              double fahr = Double.parseDouble(fahrTextField.getText());
               
            if (celsiusCheckBox.isSelected()){
                celsiusTextField.setText(Double.toString(convertToSIUnits.fahrToCelsius(fahr)));
                
            }
            else{
                JOptionPane.showConfirmDialog(rootPane, "Choose SI temperature unit");
            }
          }
          else if (rankinCheckBox.isSelected()){
              double rank = Double.parseDouble(rankinTextField.getText());
               
            if (celsiusCheckBox.isSelected()){
                celsiusTextField.setText(Double.toString(convertToSIUnits.fahrToCelsius(rank)));
                
            }
            else{
                JOptionPane.showConfirmDialog(rootPane, "Choose SI temperature unit");
            }
          }
        
    }
    
    private void temperatureToImpUnitsButtonActionPerformed(ActionEvent evt) { 
        if (celsiusCheckBox.isSelected()){
            double cels = Double.parseDouble(celsiusTextField.getText());
            
            if (fahrCheckBox.isSelected()){
                fahrTextField.setText(Double.toString(convertToImpUnits.celsiusToFahr(cels)));
                
            }
            else if (rankinCheckBox.isSelected()){
                rankinTextField.setText(Double.toString(convertToImpUnits.celsiusToRankin(cels)));
            }
        }
        else {
            JOptionPane.showConfirmDialog(null, "Choose SI temperature unit");
        }
        
      
    } 
    
   
     private void jTextField1KeyTyped(KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
    if (!isNumber(evt.getKeyChar()))
        evt.consume();
}

    
     
     
     private void jTextField1KeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V)
    {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        DataFlavor flavor = DataFlavor.stringFlavor;
        String schowek = "";
        
            try
            {
                schowek = (String) clipboard.getData(flavor);
            } 
            catch (UnsupportedFlavorException ex) 
            {
                System.out.println("To nie jest String");
            } 
            catch (IOException ex) 
            {
                System.out.println("Wystąpił błąd na wejściu/wyjściu");
            }
        
            for (int i = 0; i < schowek.length(); i++)
                if (!isNumber(schowek.charAt(i)))
                {
                    evt.consume();
                    break;
                }
    }
}
   
                                                          


   
  
    
    private boolean isNumber(char zn ){
        if (zn >= '0' && zn <= '9'){
           return true; 
        }
        return false;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(konwerterJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konwerterJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konwerterJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konwerterJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konwerterJednostek().setVisible(true);
               
            }
        });
    }
    
   
   

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox inchCheckBox;
    private javax.swing.JCheckBox ounceCheckBox;
    private javax.swing.JCheckBox ukTonCheckBox;
    private javax.swing.JTextField ukTonTextField;
    private javax.swing.JCheckBox celsiusCheckBox;
    private javax.swing.JTextField celsiusTextField;
    private javax.swing.JCheckBox centimeterCheckBox;
    private javax.swing.JTextField cmTextField;
    private javax.swing.JCheckBox cupCheckBox;
    private javax.swing.JTextField cupTextField;
    private javax.swing.JCheckBox fahrCheckBox;
    private javax.swing.JTextField fahrTextField;
    private javax.swing.JTextField flOunceTextField;
    private javax.swing.JCheckBox footCheckBox;
    private javax.swing.JTextField footTextField;
    private javax.swing.JCheckBox galonCheckBox;
    private javax.swing.JTextField galonTextField;
    private javax.swing.JCheckBox flOunceCheckBox;
    private javax.swing.JCheckBox gramCheckBox;
    private javax.swing.JTextField gramTextField;
    private javax.swing.JTextField inchTextField;
    private javax.swing.JButton weightToImpUNits;
    private javax.swing.JButton weightToSIunits;
    private javax.swing.JButton volumeToImpUnits;
    private javax.swing.JButton volumeToSIunits;
    private javax.swing.JButton lengthToImpUnits;
    private javax.swing.JButton lengthToSIunits;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox rankinCheckBox;
    private javax.swing.JTextField rankinTextField;
    private javax.swing.JCheckBox kgCheckBox;
    private javax.swing.JTextField kgTextField;
    private javax.swing.JCheckBox kilometerCheckBox;
    private javax.swing.JTextField kmTextField;
    private javax.swing.JCheckBox leagueCheckBox;
    private javax.swing.JTextField leagueTextField;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JCheckBox literCheckBox;
    private javax.swing.JTextField literTextField;
    private javax.swing.JCheckBox meterCheckBox;
    private javax.swing.JTextField meterTextField;
    private javax.swing.JCheckBox mileCheckBox;
    private javax.swing.JTextField mileTextField;
    private javax.swing.JCheckBox mlCheckBox;
    private javax.swing.JTextField mlTextField;
    private javax.swing.JTextField ounceTextField;
    private javax.swing.JCheckBox pintCheckBox;
    private javax.swing.JTextField pintTextField;
    private javax.swing.JCheckBox poundCheckBox;
    private javax.swing.JTextField poundTextField;
    private javax.swing.JCheckBox quartCheckBox;
    private javax.swing.JTextField quartTextField;
    private javax.swing.JCheckBox stoneCheckBox;
    private javax.swing.JTextField stoneTextField;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JButton temperatureToImpUnitsButton;
    private javax.swing.JButton temperatureToSIbutton;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JLabel weigthLabel;
    private javax.swing.JCheckBox yardCheckBox;
    private javax.swing.JTextField yardTextField;
    // End of variables declaration                   



}
       
   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeandroll;

/**
 *
 * Submitted By: Deepu Chaudhary (id: s4608481) and Taniya Gauchan ( id: s4602218)
 * Unit: NIT2112 OBJECT ORIENTED PROGRAMMING
 * Date : 12 Feburary, 2020
 */
/**
     * this is a code for GUI of the given problem
     * it contains 6 panels as grid layout which are:
     * 1: in this we get total sales price
     * 2: it contains shop logo
     * 3: it contains radio button from where the item is selected
     * 4: it show currency denomination of amount to be returned
     * 5: it takes quantity of product and total amount given by the customer and display the amount to be returned
     * 6: it show the total sales of each product for the day
     */
public class CashRegister extends javax.swing.JFrame {

    /**
     * Creates new form CashRegister
     */
    public CashRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SRoll = new javax.swing.JRadioButton();
        FRoll = new javax.swing.JRadioButton();
        LRoll = new javax.swing.JRadioButton();
        ICRoll = new javax.swing.JRadioButton();
        CRoll = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        paid = new javax.swing.JTextField();
        change = new javax.swing.JTextField();
        doneBtn = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel6.setText("Coffee N Roll Cash Register");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Sale price : ");

        sales.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeeandroll/cnr (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coffee N Roll Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        buttonGroup1.add(SRoll);
        SRoll.setText(" Schnitzel Roll");

        buttonGroup1.add(FRoll);
        FRoll.setText("Fish Roll ");

        buttonGroup1.add(LRoll);
        LRoll.setText("Lamb Roll");

        buttonGroup1.add(ICRoll);
        ICRoll.setText("Ice Cream Roll");

        buttonGroup1.add(CRoll);
        CRoll.setText("Coffee Latte");

        jLabel5.setText("$18.80");

        jLabel8.setText("$17.25");

        jLabel9.setText("$14.60");

        jLabel10.setText("$6.75");

        jLabel11.setText("$3.40");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ICRoll)
                        .addComponent(LRoll)
                        .addComponent(CRoll))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SRoll)
                            .addComponent(FRoll))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SRoll)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FRoll)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LRoll)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICRoll)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CRoll)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Currency Denominations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);

        error.setBackground(new java.awt.Color(255, 51, 51));
        error.setForeground(new java.awt.Color(255, 0, 51));
        error.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Quantity");

        jLabel3.setText("Paid(cent)");

        jLabel4.setText("Change");

        change.setEditable(false);
        change.setFont(new java.awt.Font("Menlo", 1, 14)); // NOI18N
        change.setEnabled(false);
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        doneBtn.setText("Done");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(quantity)
                                .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetBtn)
                .addGap(7, 7, 7)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit)
                    .addComponent(resetBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);

        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int cSRoll,cFRoll,cLRoll,cICRoll,cCRoll;
    /**
     * it show the total sales of each product for the day
     */
    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        // TODO add your handling code here:
        double tot = (double) ((cSRoll*18.80) + (cFRoll*17.25) + (cLRoll*14.60) + (cICRoll*6.75) + (cCRoll*3.40));
        double total = Math.round(tot*100.0)/100.0;
        ta2.setText("Total Schnitzel Roll Sales:         $" + Math.round((cSRoll* 18.80)*100.0)/100.0);
        ta2.append("\nTotal Fish Roll Sales:                $" + Math.round((cFRoll* 17.25)*100.0)/100.0);
        ta2.append("\nTotal Lamb Roll Sales:             $" + Math.round((cLRoll* 14.60)*100.0)/100.0);
        ta2.append("\nTotal Ice Cream Roll Sales:       $" + Math.round((cICRoll* 6.75)*100.0)/100.0);
        ta2.append("\nTotal Coffee Roll Sales:            $" + Math.round((cCRoll* 3.40)*100.0)/100.0);
        ta2.append("\n                                         ----------");
        ta2.append("\nTotal Daily Sales:                     $"+ total );
    }//GEN-LAST:event_doneBtnActionPerformed
/**
 * it takes quantity of product and total amount given by the customer and display the amount to be returned
 */
    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        int quant = Integer.parseInt(quantity.getText());
        int totalpaid = Integer.parseInt(paid.getText());
        if (SRoll.isSelected()) {
            double salesamt = Math.round((quant * 18.80) * 100.0) / 100.0;
            double amt = (totalpaid/100) - salesamt;
            if (amt < 0) {

                error.setText("Piad Amount is less");
            } else {
                ta1.setText(" ");
                error.setText(" ");
                change.setText(String.valueOf(amt));
                cSRoll += quant;
                String sale = String.valueOf(salesamt);
                sales.setText(sale);
                String damt = String.valueOf(amt);
                int indexOfDecimal = damt.indexOf(".");
                int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                countCurrencyDollar(dollarPart);
                if(centPart%5!=0){
                            centPart *= 10;
                        }
                countCurrencyCent(centPart);
            }
        }
        if (FRoll.isSelected()) {
            double salesamt = Math.round(((quant * 17.25) * 100.0) / 100.0);
            double amt = (totalpaid/100) - salesamt;
            if (amt < 0) {

                error.setText("Piad Amount is less");
            } else {
                ta1.setText(" ");
                error.setText(" ");
                change.setText(String.valueOf(amt));
                cFRoll += quant;
                String sale = String.valueOf(salesamt);
                sales.setText(sale);
                String damt = String.valueOf(amt);
                int indexOfDecimal = damt.indexOf(".");
                int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                countCurrencyDollar(dollarPart);
                if(centPart%5!=0){
                            centPart *= 10;
                        }
                countCurrencyCent(centPart);
            }
        }
        if (LRoll.isSelected()) {
            double salesamt = Math.round(((quant * 14.60) * 100.0) / 100.0);
            double amt = (totalpaid/100) - salesamt;
            if (amt < 0) {

                error.setText("Piad Amount is less");
            } else {
                ta1.setText(" ");
                error.setText(" ");
                change.setText(String.valueOf(amt));
                cLRoll += quant;
                String sale = String.valueOf(salesamt);
                sales.setText(sale);
                String damt = String.valueOf(amt);
                int indexOfDecimal = damt.indexOf(".");
                int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                countCurrencyDollar(dollarPart);
                if(centPart%5!=0){
                            centPart *= 10;
                        }
                countCurrencyCent(centPart);
            }
        }
        if (ICRoll.isSelected()) {
            double salesamt = Math.round(((quant * 6.75) * 100.0) / 100.0);
            double amt = (totalpaid/100) - salesamt;
            if (amt < 0) {

                error.setText("Piad Amount is less");
            } else {
                ta1.setText(" ");
                error.setText(" ");
                change.setText(String.valueOf(amt));
                cICRoll += quant;
                String sale = String.valueOf(salesamt);
                sales.setText(sale);
                String damt = String.valueOf(amt);
                int indexOfDecimal = damt.indexOf(".");
                int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                countCurrencyDollar(dollarPart);
                if(centPart%5!=0){
                            centPart *= 10;
                        }
                countCurrencyCent(centPart);
            }
        }
        if (CRoll.isSelected()) {
            double salesamt = Math.round(((quant * 3.40) * 100.0) / 100.0);
            double amt = (totalpaid/100) - salesamt;
            if (amt < 0) {

                error.setText("Piad Amount is less");
            } else {
                ta1.setText(" ");
                error.setText(" ");
                change.setText(String.valueOf(amt));
                cCRoll += quant;
                String sale = String.valueOf(salesamt);
                sales.setText(sale);
                String damt = String.valueOf(amt);
                int indexOfDecimal = damt.indexOf(".");
                int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                countCurrencyDollar(dollarPart);
                if(centPart%5!=0){
                            centPart *= 10;
                        }
                countCurrencyCent(centPart);
            }
        }
    }//GEN-LAST:event_calculateActionPerformed
     //this method takes input from main in int data types and calculates the currency denomination for dollar
    public void countCurrencyDollar(int amount) {
        int[] notes = new int[]{100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[7];

        // count notes using Greedy approach 
        for (int i = 0; i < 7; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // Print notes 
        for (int i = 0; i < 7; i++) {
            if (noteCounter[i] != 0) {
                if (i <= 4) {
                    ta1.append("Number of " + notes[i] + " Dollar Notes : "
                            + noteCounter[i] + "\n");
                } else {
                    ta1.append("Number of " + notes[i] + " Dollar coins : "
                            + noteCounter[i] + "\n");
                }
            }
        }
    }
     //this method takes input from main in int data types and calculates the currency denomination for cents
    public void countCurrencyCent(int amount) {
        int[] notes = new int[]{50, 20, 10, 5};
        int[] noteCounter = new int[4];

        // count notes using Greedy approach 
        for (int i = 0; i < 4; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // Print notes 
        for (int i = 0; i < 4; i++) {
            if (noteCounter[i] != 0) {
                ta1.append("Number of " + notes[i] + " cents coinss : "
                        + noteCounter[i] + "\n");
            }
        }
    }
    
    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeActionPerformed
//this method is use for reseting all the previous data entered in the application
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        error.setText("");
        sales.setText("");
        quantity.setText("");
        paid.setText("");
        change.setText("");
        ta1.setText("");
        ta2.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed
// this method is use to close the application
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(CashRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CRoll;
    private javax.swing.JRadioButton FRoll;
    private javax.swing.JRadioButton ICRoll;
    private javax.swing.JRadioButton LRoll;
    private javax.swing.JRadioButton SRoll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField change;
    private javax.swing.JButton doneBtn;
    private javax.swing.JLabel error;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel sales;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    // End of variables declaration//GEN-END:variables
}
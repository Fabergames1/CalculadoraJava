
public class Calculadora extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    public Calculadora() {
        initComponents();
    }

 
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldOperacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonMas = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonPor = new javax.swing.JButton();
        jButtonEntre = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculadoraJAVA");

        jTextFieldOperacion.setEditable(false);
        jTextFieldOperacion.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jTextFieldOperacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonMas.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButtonMas.setText("+");
        jButtonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 0, 14));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Consolas", 0, 14));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonMenos.setFont(new java.awt.Font("Consolas", 0, 14));
        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonPor.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButtonPor.setText("*");
        jButtonPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100 , javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonPor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextFieldOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonEntre.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButtonEntre.setText("/");
        jButtonEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntreActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Consolas", 0, 18));
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Consolas", 0, 14)); 
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,  javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("1"));

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("4"));
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("7"));
    }

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("0"));
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("2"));
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("3"));
    }

    private void jButtonMasActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat(" + "));
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("5"));
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("6"));
    }

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat(" - "));
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("8"));
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat("9"));
    }

    private void jButtonPorActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat(" * "));
    }

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText("");
    }

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {
        String[] operacion = jTextFieldOperacion.getText().split(" ");
        double resultado = 0;

        switch (operacion[1]) {
            case "+":
                resultado = Double.parseDouble(operacion[0]) + Double.parseDouble(operacion[2]);
                break;
            case "-":
                resultado = Double.parseDouble(operacion[0]) - Double.parseDouble(operacion[2]);
                break;
            case "*":
                resultado += Double.parseDouble(operacion[0]) * Double.parseDouble(operacion[2]);
                break;
            case "/":
                try {
                    resultado = Double.parseDouble(operacion[0]) / Double.parseDouble(operacion[2]);
                } catch (Exception e) {
                }

                break;
        }

        if (operacion.length > 3) {

            switch (operacion[3]) {
                case "+":
                    resultado += Double.parseDouble(operacion[4]);
                    break;
                case "-":
                    resultado -= Double.parseDouble(operacion[4]);
                    break;
                case "*":
                    resultado *= Double.parseDouble(operacion[4]);
                    break;
                case "/":

                    try {
                        resultado /= Double.parseDouble(operacion[4]);
                    } catch (Exception e) {
                    }

                    break;
            }

        }

        if (operacion.length > 5) {

            switch (operacion[5]) {
                case "+":
                    resultado += Double.parseDouble(operacion[6]);
                    break;
                case "-":
                    resultado -= Double.parseDouble(operacion[6]);
                    break;
                case "*":
                    resultado *= Double.parseDouble(operacion[6]);
                    break;
                case "/":
                    try {
                        resultado /= Double.parseDouble(operacion[6]);
                    } catch (Exception e) {
                    }
                    break;
            }

        }

        jTextFieldOperacion.setText(String.valueOf(resultado));


    }

    private void jButtonEntreActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacion.setText(jTextFieldOperacion.getText().concat(" / "));
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonEntre;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMas;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonPor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldOperacion;
   
}

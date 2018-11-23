package graphics;

public class Login extends javax.swing.JDialog
{
	public Login(java.awt.Frame parent, boolean modal)
	{
		super(parent, modal);
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    java.awt.GridBagConstraints gridBagConstraints;

    bgGroup = new javax.swing.ButtonGroup();
    plLogIn = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    tfEMailL = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    tfPasswordL = new javax.swing.JTextField();
    btLogIn = new javax.swing.JButton();
    btExitL = new javax.swing.JButton();
    plRegister = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    tfEMailR = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    tfUsernameR = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    tfPasswordR = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    tfVerPasswordR = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    tfBirthdateR = new javax.swing.JTextField();
    btRegister = new javax.swing.JButton();
    btExitR = new javax.swing.JButton();
    plWindow = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();

    plLogIn.setLayout(new java.awt.GridBagLayout());

    jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel1.setText(" E-Mail: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
    gridBagConstraints.weightx = 0.5;
    plLogIn.add(jLabel1, gridBagConstraints);

    tfEMailL.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
    gridBagConstraints.weightx = 0.5;
    plLogIn.add(tfEMailL, gridBagConstraints);

    jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel2.setText(" Password: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    plLogIn.add(jLabel2, gridBagConstraints);

    tfPasswordL.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    plLogIn.add(tfPasswordL, gridBagConstraints);

    btLogIn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    btLogIn.setText("LogIn");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
    plLogIn.add(btLogIn, gridBagConstraints);

    btExitL.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    btExitL.setText("Exit");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
    plLogIn.add(btExitL, gridBagConstraints);

    plRegister.setLayout(new java.awt.GridLayout(0, 2));

    jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel3.setText(" E-Mail: ");
    plRegister.add(jLabel3);

    tfEMailR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    plRegister.add(tfEMailR);

    jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel5.setText(" Username: ");
    plRegister.add(jLabel5);

    tfUsernameR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    plRegister.add(tfUsernameR);

    jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel7.setText(" Password: ");
    plRegister.add(jLabel7);

    tfPasswordR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    plRegister.add(tfPasswordR);

    jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel6.setText(" verify Password: ");
    plRegister.add(jLabel6);

    tfVerPasswordR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    plRegister.add(tfVerPasswordR);

    jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jLabel8.setText(" Birthdate: ");
    plRegister.add(jLabel8);

    tfBirthdateR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    plRegister.add(tfBirthdateR);

    btRegister.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    btRegister.setText("Register");
    plRegister.add(btRegister);

    btExitR.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    btExitR.setText("Exit");
    plRegister.add(btExitR);

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    plWindow.setLayout(new java.awt.GridLayout(1, 1));
    getContentPane().add(plWindow, java.awt.BorderLayout.CENTER);

    jPanel1.setLayout(new java.awt.GridLayout(1, 0));

    bgGroup.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("LogIn");
    jRadioButton1.setFocusPainted(false);
    jRadioButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onLogIn(evt);
      }
    });
    jPanel1.add(jRadioButton1);

    bgGroup.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jRadioButton2.setText("Register");
    jRadioButton2.setFocusPainted(false);
    jRadioButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onRegister(evt);
      }
    });
    jPanel1.add(jRadioButton2);

    getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onLogIn(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLogIn
  {//GEN-HEADEREND:event_onLogIn
		
  }//GEN-LAST:event_onLogIn

  private void onRegister(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onRegister
  {//GEN-HEADEREND:event_onRegister
    
  }//GEN-LAST:event_onRegister

	
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				Login dialog = new Login(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter()
				{
					@Override
					public void windowClosing(java.awt.event.WindowEvent e)
					{
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup bgGroup;
  private javax.swing.JButton btExitL;
  private javax.swing.JButton btExitR;
  private javax.swing.JButton btLogIn;
  private javax.swing.JButton btRegister;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JPanel plLogIn;
  private javax.swing.JPanel plRegister;
  private javax.swing.JPanel plWindow;
  private javax.swing.JTextField tfBirthdateR;
  private javax.swing.JTextField tfEMailL;
  private javax.swing.JTextField tfEMailR;
  private javax.swing.JTextField tfPasswordL;
  private javax.swing.JTextField tfPasswordR;
  private javax.swing.JTextField tfUsernameR;
  private javax.swing.JTextField tfVerPasswordR;
  // End of variables declaration//GEN-END:variables
}

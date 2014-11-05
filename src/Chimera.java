/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author Hudson and Bryan
 */
public class Chimera extends javax.swing.JFrame {

    /**
     * Creates new form Chimera
     */
    
    public Chimera() {
        initComponents();
    }
    
    // Animals
    Animal goldenRetriever = new Animal("Dog", "Golden Retriever", 15);
    Animal beagle = new Animal("Dog", "Beagle", 20);
    Animal siamese = new Animal("Cat", "Siamese", 13);
    Animal calico = new Animal("Cat", "Calico", 14);
    Animal rabbit = new Animal("Rabbit", "Bunny", 10);
    Animal elephant = new Animal("Elephant", "African", 100);
    Animal blackBear = new Animal("Bear", "Black Bear", 80);
    Animal polarBear = new Animal("Bear", "Polar Bear", 90);
    
    // current state
    ChimeraCreation current = 
            new ChimeraCreation(goldenRetriever,
                                goldenRetriever,
                                goldenRetriever,
                                "Docile",
                                "Medium",
                                new ArrayList());
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personalityDialog = new javax.swing.JDialog();
        jRadioButton3 = new javax.swing.JRadioButton();
        docileRadioButton = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        personalityButtonGroup = new javax.swing.ButtonGroup();
        CardPanel = new javax.swing.JPanel();
        ChimeraEntryPanel = new javax.swing.JPanel();
        ChimeraWelcomePanel = new javax.swing.JPanel();
        ChimeraLogoPanel = new javax.swing.JPanel();
        ChimeraNameLabel = new javax.swing.JLabel();
        ChimeraChoosePanel = new javax.swing.JPanel();
        BufferPanel = new javax.swing.JPanel();
        BufferLabel = new javax.swing.JLabel();
        ChooseTextPanel = new javax.swing.JPanel();
        ChooseLabel = new javax.swing.JLabel();
        BaseAnimalChoicePanel = new javax.swing.JPanel();
        DogButton = new javax.swing.JButton();
        CatButton = new javax.swing.JButton();
        RabbitButton = new javax.swing.JButton();
        ElephantButton = new javax.swing.JButton();
        BearButton = new javax.swing.JButton();
        ChimeraDesignPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        designPanel = new javax.swing.JPanel();
        AnimalViewPanel = new javax.swing.JPanel();
        AnimalViewHeadPanel = new javax.swing.JPanel();
        AnimalViewHeadLabel = new javax.swing.JLabel();
        AnimalViewTorsoPanel = new javax.swing.JPanel();
        AnimalViewTorsoLabel = new javax.swing.JLabel();
        AnimalViewLegsPanel = new javax.swing.JPanel();
        AnimalViewLegsLabel = new javax.swing.JLabel();
        ChangeAnimalRightPanel = new javax.swing.JPanel();
        ChangeHeadRightButton = new javax.swing.JButton();
        ChangeTorsoRightButton = new javax.swing.JButton();
        ChangeLegsRightButton = new javax.swing.JButton();
        ChangeAnimalLeftPanel = new javax.swing.JPanel();
        ChangeHeadLeftButton = new javax.swing.JButton();
        ChangeTorsoLeftButton = new javax.swing.JButton();
        ChangeLegsLeftButton = new javax.swing.JButton();
        personalityPanel = new javax.swing.JPanel();
        skillsPanel = new javax.swing.JPanel();
        tricksjPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        trainingPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        cartPanel = new javax.swing.JPanel();
        cartScrollPanel = new javax.swing.JScrollPane();
        itemsPanel = new javax.swing.JPanel();
        CartHeadPanel = new javax.swing.JPanel();
        headLabel = new javax.swing.JLabel();
        headSpaceFiller = new javax.swing.JLabel();
        headChoiceLabel = new javax.swing.JLabel();
        headPriceLabel = new javax.swing.JLabel();
        CartTorsoPanel = new javax.swing.JPanel();
        torsoLabel = new javax.swing.JLabel();
        torsoSpaceFiller = new javax.swing.JLabel();
        torsoChoiceLabel = new javax.swing.JLabel();
        torsoPriceLabel = new javax.swing.JLabel();
        CartLegsPanel = new javax.swing.JPanel();
        legsLabel = new javax.swing.JLabel();
        legsSpaceFiller = new javax.swing.JLabel();
        legsChoiceLabel = new javax.swing.JLabel();
        legsPriceLabel = new javax.swing.JLabel();
        CartTricksPanel = new javax.swing.JPanel();
        tricksLabel = new javax.swing.JLabel();
        tricksPriceLabel = new javax.swing.JLabel();
        tricksListPanel = new javax.swing.JPanel();
        totalPanel = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();

        personalityDialog.setTitle("Personality Chooser");
        personalityDialog.setBounds(new java.awt.Rectangle(0, 0, 120, 40));
        personalityDialog.getContentPane().setLayout(new java.awt.FlowLayout());

        personalityButtonGroup.add(jRadioButton3);
        jRadioButton3.setText("Protective");
        personalityDialog.getContentPane().add(jRadioButton3);

        personalityButtonGroup.add(docileRadioButton);
        docileRadioButton.setText("Docile");
        docileRadioButton.setSelected(true);
        personalityDialog.getContentPane().add(docileRadioButton);

        personalityButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Aggressive");
        personalityDialog.getContentPane().add(jRadioButton1);

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        personalityDialog.getContentPane().add(jButton3);

        personalityDialog.pack();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardPanel.setLayout(new java.awt.CardLayout());

        ChimeraEntryPanel.setLayout(new java.awt.GridLayout(2, 1));

        ChimeraWelcomePanel.setLayout(new java.awt.GridLayout(2, 1));

        ChimeraNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        ChimeraNameLabel.setText("Chimera");
        ChimeraLogoPanel.add(ChimeraNameLabel);

        ChimeraWelcomePanel.add(ChimeraLogoPanel);

        ChimeraChoosePanel.setLayout(new java.awt.GridLayout(2, 1));

        BufferLabel.setText("----------------");
        BufferPanel.add(BufferLabel);

        ChimeraChoosePanel.add(BufferPanel);

        ChooseLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ChooseLabel.setText("Choose Your Base Animal:");
        ChooseTextPanel.add(ChooseLabel);

        ChimeraChoosePanel.add(ChooseTextPanel);

        ChimeraWelcomePanel.add(ChimeraChoosePanel);

        ChimeraEntryPanel.add(ChimeraWelcomePanel);

        BaseAnimalChoicePanel.setLayout(new java.awt.GridLayout(1, 5));

        DogButton.setText("Dog");
        DogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DogButtonMouseClicked(evt);
            }
        });
        BaseAnimalChoicePanel.add(DogButton);

        CatButton.setText("Cat");
        CatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatButtonMouseClicked(evt);
            }
        });
        BaseAnimalChoicePanel.add(CatButton);

        RabbitButton.setText("Rabbit");
        RabbitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RabbitButtonMouseClicked(evt);
            }
        });
        BaseAnimalChoicePanel.add(RabbitButton);

        ElephantButton.setText("Elephant");
        ElephantButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElephantButtonMouseClicked(evt);
            }
        });
        BaseAnimalChoicePanel.add(ElephantButton);

        BearButton.setText("Bear");
        BearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BearButtonMouseClicked(evt);
            }
        });
        BaseAnimalChoicePanel.add(BearButton);

        ChimeraEntryPanel.add(BaseAnimalChoicePanel);

        CardPanel.add(ChimeraEntryPanel, "card3");

        ChimeraDesignPanel.setLayout(new java.awt.BorderLayout());

        designPanel.setLayout(new java.awt.BorderLayout());

        AnimalViewPanel.setLayout(new java.awt.GridLayout(3, 1));

        AnimalViewHeadLabel.setText("Dog");
        AnimalViewHeadPanel.add(AnimalViewHeadLabel);

        AnimalViewPanel.add(AnimalViewHeadPanel);

        AnimalViewTorsoLabel.setText("Dog");
        AnimalViewTorsoPanel.add(AnimalViewTorsoLabel);

        AnimalViewPanel.add(AnimalViewTorsoPanel);

        AnimalViewLegsLabel.setText("Dog");
        AnimalViewLegsPanel.add(AnimalViewLegsLabel);

        AnimalViewPanel.add(AnimalViewLegsPanel);

        designPanel.add(AnimalViewPanel, java.awt.BorderLayout.CENTER);

        ChangeAnimalRightPanel.setLayout(new java.awt.GridLayout(3, 1));

        ChangeHeadRightButton.setText("---->");
        ChangeHeadRightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeHeadRightButtonMouseClicked(evt);
            }
        });
        ChangeAnimalRightPanel.add(ChangeHeadRightButton);

        ChangeTorsoRightButton.setText("---->");
        ChangeTorsoRightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeTorsoRightButtonMouseClicked(evt);
            }
        });
        ChangeTorsoRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeTorsoRightButtonActionPerformed(evt);
            }
        });
        ChangeAnimalRightPanel.add(ChangeTorsoRightButton);

        ChangeLegsRightButton.setText("---->");
        ChangeLegsRightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeLegsRightButtonMouseClicked(evt);
            }
        });
        ChangeAnimalRightPanel.add(ChangeLegsRightButton);

        designPanel.add(ChangeAnimalRightPanel, java.awt.BorderLayout.LINE_END);

        ChangeAnimalLeftPanel.setLayout(new java.awt.GridLayout(3, 1));

        ChangeHeadLeftButton.setText("<----");
        ChangeHeadLeftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeHeadLeftButtonMouseClicked(evt);
            }
        });
        ChangeAnimalLeftPanel.add(ChangeHeadLeftButton);

        ChangeTorsoLeftButton.setText("<----");
        ChangeTorsoLeftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeTorsoLeftButtonMouseClicked(evt);
            }
        });
        ChangeAnimalLeftPanel.add(ChangeTorsoLeftButton);

        ChangeLegsLeftButton.setText("<----");
        ChangeLegsLeftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeLegsLeftButtonMouseClicked(evt);
            }
        });
        ChangeAnimalLeftPanel.add(ChangeLegsLeftButton);

        designPanel.add(ChangeAnimalLeftPanel, java.awt.BorderLayout.LINE_START);

        jTabbedPane1.addTab("Design", designPanel);

        personalityPanel.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Personality", personalityPanel);

        skillsPanel.setLayout(new java.awt.GridLayout(1, 2));

        tricksjPanel.setLayout(new java.awt.GridLayout(6, 1));

        jLabel1.setText("Tricks");
        jPanel1.add(jLabel1);

        tricksjPanel.add(jPanel1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox1.setText("Sit");
        jPanel2.add(jCheckBox1);

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);

        tricksjPanel.add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox2.setText("Stay");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox2);

        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);

        tricksjPanel.add(jPanel3);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox3.setText("Come");
        jPanel4.add(jCheckBox3);

        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5);

        tricksjPanel.add(jPanel4);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox4.setText("Shake Hands");
        jPanel5.add(jCheckBox4);

        jLabel6.setText("jLabel6");
        jPanel5.add(jLabel6);

        tricksjPanel.add(jPanel5);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox5.setText("Play Dead");
        jPanel6.add(jCheckBox5);

        jLabel7.setText("jLabel7");
        jPanel6.add(jLabel7);

        tricksjPanel.add(jPanel6);

        skillsPanel.add(tricksjPanel);

        trainingPanel.setLayout(new java.awt.GridLayout(6, 1));

        jLabel8.setText("Training");
        jPanel7.add(jLabel8);

        trainingPanel.add(jPanel7);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox10.setText("Therapy");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel8.add(jCheckBox10);

        jLabel9.setText("jLabel9");
        jPanel8.add(jLabel9);

        trainingPanel.add(jPanel8);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox11.setText("Agility");
        jPanel9.add(jCheckBox11);

        jLabel10.setText("jLabel10");
        jPanel9.add(jLabel10);

        trainingPanel.add(jPanel9);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox12.setText("Seeing");
        jPanel10.add(jCheckBox12);

        jLabel11.setText("jLabel11");
        jPanel10.add(jLabel11);

        trainingPanel.add(jPanel10);

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox13.setText("Comfort");
        jPanel11.add(jCheckBox13);

        jLabel12.setText("jLabel12");
        jPanel11.add(jLabel12);

        trainingPanel.add(jPanel11);

        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox14.setText("jCheckBox14");
        jPanel12.add(jCheckBox14);

        jLabel13.setText("jLabel13");
        jPanel12.add(jLabel13);

        trainingPanel.add(jPanel12);

        skillsPanel.add(trainingPanel);

        jTabbedPane1.addTab("Skills", skillsPanel);

        ChimeraDesignPanel.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        cartPanel.setPreferredSize(new java.awt.Dimension(130, 280));
        cartPanel.setLayout(new java.awt.BorderLayout());

        itemsPanel.setLayout(new java.awt.GridLayout(5, 0, 0, 5));

        CartHeadPanel.setLayout(new java.awt.GridLayout(2, 2));

        headLabel.setText("Head:");
        CartHeadPanel.add(headLabel);
        CartHeadPanel.add(headSpaceFiller);
        CartHeadPanel.add(headChoiceLabel);

        headPriceLabel.setText("$0.00");
        CartHeadPanel.add(headPriceLabel);

        itemsPanel.add(CartHeadPanel);

        CartTorsoPanel.setLayout(new java.awt.GridLayout(2, 2));

        torsoLabel.setText("Torso:");
        CartTorsoPanel.add(torsoLabel);
        CartTorsoPanel.add(torsoSpaceFiller);
        CartTorsoPanel.add(torsoChoiceLabel);

        torsoPriceLabel.setText("$0.00");
        CartTorsoPanel.add(torsoPriceLabel);

        itemsPanel.add(CartTorsoPanel);

        CartLegsPanel.setLayout(new java.awt.GridLayout(2, 2));

        legsLabel.setText("Legs:");
        CartLegsPanel.add(legsLabel);
        CartLegsPanel.add(legsSpaceFiller);
        CartLegsPanel.add(legsChoiceLabel);

        legsPriceLabel.setText("$0.00");
        CartLegsPanel.add(legsPriceLabel);

        itemsPanel.add(CartLegsPanel);

        CartTricksPanel.setLayout(new java.awt.GridLayout(2, 2));

        tricksLabel.setText("Tricks:");
        CartTricksPanel.add(tricksLabel);

        tricksPriceLabel.setText("$0.00");
        CartTricksPanel.add(tricksPriceLabel);

        tricksListPanel.setLayout(new java.awt.GridLayout(10, 1));
        CartTricksPanel.add(tricksListPanel);

        itemsPanel.add(CartTricksPanel);

        cartScrollPanel.setViewportView(itemsPanel);

        cartPanel.add(cartScrollPanel, java.awt.BorderLayout.CENTER);

        totalPanel.setPreferredSize(new java.awt.Dimension(150, 30));

        totalLabel.setText("Total:");
        totalPanel.add(totalLabel);

        totalPriceLabel.setText("jLabel3");
        totalPanel.add(totalPriceLabel);

        cartPanel.add(totalPanel, java.awt.BorderLayout.PAGE_END);

        ChimeraDesignPanel.add(cartPanel, java.awt.BorderLayout.EAST);

        CardPanel.add(ChimeraDesignPanel, "card2");

        getContentPane().add(CardPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        personalityDialog.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ChangeTorsoRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeTorsoRightButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeTorsoRightButtonActionPerformed

    private void DogButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DogButtonMouseClicked
        this.switchToDesignPanel(goldenRetriever);
    }//GEN-LAST:event_DogButtonMouseClicked

    private void CatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatButtonMouseClicked
        this.switchToDesignPanel(calico);
    }//GEN-LAST:event_CatButtonMouseClicked

    private void RabbitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RabbitButtonMouseClicked
        this.switchToDesignPanel(rabbit);
    }//GEN-LAST:event_RabbitButtonMouseClicked

    private void ElephantButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElephantButtonMouseClicked
        this.switchToDesignPanel(elephant);
    }//GEN-LAST:event_ElephantButtonMouseClicked

    private void BearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BearButtonMouseClicked
        this.switchToDesignPanel(blackBear);
    }//GEN-LAST:event_BearButtonMouseClicked

    private void ChangeHeadLeftButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeHeadLeftButtonMouseClicked
        Animal animal = this.cycleAnimals(current.head, "Backwards");
        current.head = animal;
        AnimalViewHeadLabel.setText(animal.name);
        headChoiceLabel.setText(animal.name);
        headPriceLabel.setText(formatPriceString(animal.price));
        this.setTotal();
    }//GEN-LAST:event_ChangeHeadLeftButtonMouseClicked

    private void ChangeTorsoLeftButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeTorsoLeftButtonMouseClicked
        Animal animal = this.cycleAnimals(current.torso, "Backwards");
        current.torso = animal;
        AnimalViewTorsoLabel.setText(animal.name);
        torsoChoiceLabel.setText(animal.name);
        torsoPriceLabel.setText(formatPriceString(animal.price));
        this.setTotal();
    }//GEN-LAST:event_ChangeTorsoLeftButtonMouseClicked

    private void ChangeLegsLeftButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeLegsLeftButtonMouseClicked
        Animal animal = this.cycleAnimals(current.legs, "Backwards");
        current.legs = animal;
        AnimalViewLegsLabel.setText(animal.name);
        legsChoiceLabel.setText(animal.name);
        legsPriceLabel.setText(formatPriceString(animal.price));
        this.setTotal();
    }//GEN-LAST:event_ChangeLegsLeftButtonMouseClicked

    private void ChangeHeadRightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeHeadRightButtonMouseClicked
        Animal animal = this.cycleAnimals(current.head, "Forwards");
        current.head = animal;
        AnimalViewHeadLabel.setText(animal.name);
        headChoiceLabel.setText(animal.name);
        headPriceLabel.setText(formatPriceString(animal.price));
        this.setTotal();
    }//GEN-LAST:event_ChangeHeadRightButtonMouseClicked

    private void ChangeTorsoRightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeTorsoRightButtonMouseClicked
        Animal animal = this.cycleAnimals(current.torso, "Forwards");
        current.torso = animal;
        AnimalViewTorsoLabel.setText(animal.name);
        torsoChoiceLabel.setText(animal.name);
        torsoPriceLabel.setText(formatPriceString(animal.price));
        this.setTotal();
    }//GEN-LAST:event_ChangeTorsoRightButtonMouseClicked

    private void ChangeLegsRightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeLegsRightButtonMouseClicked
        Animal animal = this.cycleAnimals(current.legs, "Forwards");
        current.legs = animal;
        AnimalViewLegsLabel.setText(animal.name);
        legsChoiceLabel.setText(animal.name);
        legsPriceLabel.setText(formatPriceString(animal.price));
        this.setTotal();
    }//GEN-LAST:event_ChangeLegsRightButtonMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void switchToDesignPanel(Animal baseAnimal){
        CardLayout cl = (CardLayout)(CardPanel.getLayout());
        cl.next(CardPanel);
        
        current.head = baseAnimal;
        current.torso = baseAnimal;
        current.legs = baseAnimal;
        
        AnimalViewHeadLabel.setText(current.head.name);
        AnimalViewTorsoLabel.setText(current.torso.name);
        AnimalViewLegsLabel.setText(current.legs.name);
        headChoiceLabel.setText(current.head.name);
        headPriceLabel.setText(formatPriceString(current.head.price));
        torsoChoiceLabel.setText(current.torso.name);
        torsoPriceLabel.setText(formatPriceString(current.torso.price));
        legsChoiceLabel.setText(current.legs.name);
        legsPriceLabel.setText(formatPriceString(current.legs.price));
        this.setTotal();
    }
    
    // Decides which animal is next in rotation
    // This should probably change from nested switch statements and use 
    // a doubly linked list or something
    private Animal cycleAnimals(Animal current, String direction){
        
        Animal result = goldenRetriever;
        
        if (direction.equals("Forwards")){
            switch (current.name){
                case "Dog":
                    result = calico;
                    break;
                case "Cat":
                    result = rabbit;
                    break;
                case "Rabbit":
                    result = elephant;
                    break;
                case "Elephant":
                    result = blackBear;
                    break;
                case "Bear":
                    result = goldenRetriever;
                    break;
            }
        } else if (direction.equals("Backwards")){
            switch (current.name){
                case "Dog":
                    result = blackBear;
                    break;
                case "Cat":
                    result = goldenRetriever;
                    break;
                case "Rabbit":
                    result = calico;
                    break;
                case "Elephant":
                    result = rabbit;
                    break;
                case "Bear":
                    result = elephant;
                    break;
            } 
        }
        
        return result;
        
    }
    
    // Takes price integer and returns string in dollar format
    private String formatPriceString(int price){
        String amt = Integer.toString(price);
        return "$" + amt + ".00";
    }
    
    // takes a price string and returns integer of equivalent value
    private int priceStringToInt(String price){
        String[] parts = price.split(".");
        return Integer.parseInt(parts[0].split("$")[1]);
    }
    
    //sets the total amount for the current state of the creation
    private void setTotal(){
        this.current.computeTotal();
        totalPriceLabel.setText(formatPriceString(current.price));
    }
    
    private void addSkill(String skillName, int price, String descr){
        Skill skill = new Skill(skillName, price, descr);
        current.skills.add(skill);
    }
    
    //sets the list of skills selected for this creation
    private void setSkills(){
        if (current.skills.size() > 0){
            for (Skill skill : current.skills) {
                JLabel label = new JLabel(skill.name);
                tricksListPanel.add(label);
            }
        }
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
            java.util.logging.Logger.getLogger(Chimera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chimera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chimera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chimera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chimera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnimalViewHeadLabel;
    private javax.swing.JPanel AnimalViewHeadPanel;
    private javax.swing.JLabel AnimalViewLegsLabel;
    private javax.swing.JPanel AnimalViewLegsPanel;
    private javax.swing.JPanel AnimalViewPanel;
    private javax.swing.JLabel AnimalViewTorsoLabel;
    private javax.swing.JPanel AnimalViewTorsoPanel;
    private javax.swing.JPanel BaseAnimalChoicePanel;
    private javax.swing.JButton BearButton;
    private javax.swing.JLabel BufferLabel;
    private javax.swing.JPanel BufferPanel;
    private javax.swing.JPanel CardPanel;
    private javax.swing.JPanel CartHeadPanel;
    private javax.swing.JPanel CartLegsPanel;
    private javax.swing.JPanel CartTorsoPanel;
    private javax.swing.JPanel CartTricksPanel;
    private javax.swing.JButton CatButton;
    private javax.swing.JPanel ChangeAnimalLeftPanel;
    private javax.swing.JPanel ChangeAnimalRightPanel;
    private javax.swing.JButton ChangeHeadLeftButton;
    private javax.swing.JButton ChangeHeadRightButton;
    private javax.swing.JButton ChangeLegsLeftButton;
    private javax.swing.JButton ChangeLegsRightButton;
    private javax.swing.JButton ChangeTorsoLeftButton;
    private javax.swing.JButton ChangeTorsoRightButton;
    private javax.swing.JPanel ChimeraChoosePanel;
    private javax.swing.JPanel ChimeraDesignPanel;
    private javax.swing.JPanel ChimeraEntryPanel;
    private javax.swing.JPanel ChimeraLogoPanel;
    private javax.swing.JLabel ChimeraNameLabel;
    private javax.swing.JPanel ChimeraWelcomePanel;
    private javax.swing.JLabel ChooseLabel;
    private javax.swing.JPanel ChooseTextPanel;
    private javax.swing.JButton DogButton;
    private javax.swing.JButton ElephantButton;
    private javax.swing.JButton RabbitButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JScrollPane cartScrollPanel;
    private javax.swing.JPanel designPanel;
    private javax.swing.JRadioButton docileRadioButton;
    private javax.swing.JLabel headChoiceLabel;
    private javax.swing.JLabel headLabel;
    private javax.swing.JLabel headPriceLabel;
    private javax.swing.JLabel headSpaceFiller;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel legsChoiceLabel;
    private javax.swing.JLabel legsLabel;
    private javax.swing.JLabel legsPriceLabel;
    private javax.swing.JLabel legsSpaceFiller;
    private javax.swing.ButtonGroup personalityButtonGroup;
    private javax.swing.JDialog personalityDialog;
    private javax.swing.JPanel personalityPanel;
    private javax.swing.JPanel skillsPanel;
    private javax.swing.JLabel torsoChoiceLabel;
    private javax.swing.JLabel torsoLabel;
    private javax.swing.JLabel torsoPriceLabel;
    private javax.swing.JLabel torsoSpaceFiller;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JPanel totalPanel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JPanel trainingPanel;
    private javax.swing.JLabel tricksLabel;
    private javax.swing.JPanel tricksListPanel;
    private javax.swing.JLabel tricksPriceLabel;
    private javax.swing.JPanel tricksjPanel;
    // End of variables declaration//GEN-END:variables

    // Represents a customa Chimera Creation currently being assembled
    private class ChimeraCreation{
        
        Animal head;
        Animal torso;
        Animal legs;
        int price;
        String temperament;
        String energyLevel;
        ArrayList<Skill> skills;
        
        public ChimeraCreation(Animal head, Animal torso, Animal legs, 
                               String temperament, String energyLevel, 
                               ArrayList<Skill> skills){
            this.head = head;
            this.torso = torso;
            this.legs = legs;
            this.price = 0;
            this.temperament = temperament;
            this.energyLevel = energyLevel;
            this.skills = skills;
            
            computeTotal();
        }
        
        // computes total for creation based on price of head, torso, legs,
        // and skills
        public void computeTotal(){
            this.price = this.head.price + this.torso.price + this.legs.price;
        }
        
        // computes the price of all the skills chosen for the creation
        private int computeSkillsTotal(){
            int total = 0;
            if (this.skills.size() > 0){
                for (Skill skill : this.skills) {
                    total += skill.price;
                }
            }
            return total;
        }
        
    }
    
    // Represents an animal that can be selected for a Chimera Creation
    // body part
    private class Animal{
        
        String name;
        String breed;
        int price;
        
        public Animal(String name, String breed, int price){
            this.name = name;
            this.breed = breed;
            this.price = price;
        }
        
    }
    
    // represents a skill that a Chimera Creation can have
    private class Skill{
        
        String name;
        int price;
        String description;
        
        public Skill(String name, int price, String description){
            this.name = name;
            this.price = price;
            this.description = description;
        }
        
    }
}

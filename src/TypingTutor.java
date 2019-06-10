
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//Put on Piano mode and type: fjlxfffffjlxcxjlljxff OR jgdgjjjgggjzzjgdgjjjggjgd OR mnmnmxbcl

public class TypingTutor extends javax.swing.JFrame {
    
    
    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("File not Found");
        }
           
    }
    
    
    int wc = 0;
    private Color selectedButtonColor = Color.yellow;
    private Clip Q;
    private String song;
    private JButton[] keyJButtons = new JButton[KeyEvent.KEY_LAST + 100];

    Font font = new Font("MS Reference Sans Serif", Font.PLAIN, 12);

    public TypingTutor() {
        initComponents();
        keyJButtons[KeyEvent.VK_Q] = qbutton;
        keyJButtons[KeyEvent.VK_W] = wbutton;
        keyJButtons[KeyEvent.VK_E] = ebutton;
        keyJButtons[KeyEvent.VK_R] = rbutton;
        keyJButtons[KeyEvent.VK_T] = tbutton;
        keyJButtons[KeyEvent.VK_Y] = ybutton;
        keyJButtons[KeyEvent.VK_U] = ubutton;
        keyJButtons[KeyEvent.VK_I] = ibutton;
        keyJButtons[KeyEvent.VK_O] = obutton;
        keyJButtons[KeyEvent.VK_P] = pbutton;
        keyJButtons[KeyEvent.VK_A] = abutton;
        keyJButtons[KeyEvent.VK_S] = sbutton;
        keyJButtons[KeyEvent.VK_D] = dbutton;
        keyJButtons[KeyEvent.VK_F] = fbutton;
        keyJButtons[KeyEvent.VK_G] = gbutton;
        keyJButtons[KeyEvent.VK_H] = hbutton;
        keyJButtons[KeyEvent.VK_J] = jbutton;
        keyJButtons[KeyEvent.VK_K] = kbutton;
        keyJButtons[KeyEvent.VK_L] = lbutton;
        keyJButtons[KeyEvent.VK_Z] = zbutton;
        keyJButtons[KeyEvent.VK_X] = xbutton;
        keyJButtons[KeyEvent.VK_C] = cbutton;
        keyJButtons[KeyEvent.VK_V] = vbutton;
        keyJButtons[KeyEvent.VK_B] = bbutton;
        keyJButtons[KeyEvent.VK_N] = nbutton;
        keyJButtons[KeyEvent.VK_M] = mbutton;
        keyJButtons[KeyEvent.VK_ENTER] = entbutton;
        keyJButtons[KeyEvent.VK_SPACE] = spbutton;
        keyJButtons[KeyEvent.VK_DEAD_GRAVE] = sqlinebutton;
        keyJButtons[KeyEvent.VK_MINUS] = minbutton;
        keyJButtons[KeyEvent.VK_EQUALS] = plusbutton;
        keyJButtons[KeyEvent.VK_BACK_SPACE] = backbutton;
        keyJButtons[KeyEvent.VK_TAB] = tabbutton;
        keyJButtons[KeyEvent.VK_0] = zero;
        keyJButtons[KeyEvent.VK_1] = one;
        keyJButtons[KeyEvent.VK_2] = two;
        keyJButtons[KeyEvent.VK_3] = three;
        keyJButtons[KeyEvent.VK_4] = four;
        keyJButtons[KeyEvent.VK_5] = five;
        keyJButtons[KeyEvent.VK_6] = six;
        keyJButtons[KeyEvent.VK_7] = seven;
        keyJButtons[KeyEvent.VK_8] = eight;
        keyJButtons[KeyEvent.VK_9] = nine;
        keyJButtons[KeyEvent.VK_CAPS_LOCK] = capsbutton;
        keyJButtons[KeyEvent.VK_SHIFT] = shiftbutton;
        keyJButtons[KeyEvent.VK_LEFT] = leftbutton;
        keyJButtons[KeyEvent.VK_DOWN] = downbutton;
        keyJButtons[KeyEvent.VK_UP] = upbutton;
        keyJButtons[KeyEvent.VK_RIGHT] = rightbutton;
        keyJButtons[KeyEvent.VK_COMMA] = commabutton;
        keyJButtons[KeyEvent.VK_PERIOD] = stopbutton;
        keyJButtons[KeyEvent.VK_SLASH] = quebutton;
        keyJButtons[KeyEvent.VK_OPEN_BRACKET] = opbkt;
        keyJButtons[KeyEvent.VK_CLOSE_BRACKET] = clbkt;
        keyJButtons[KeyEvent.VK_BACK_SLASH] = bkslsh;
        keyJButtons[KeyEvent.VK_QUOTE] = atbutton;
        keyJButtons[KeyEvent.VK_SEMICOLON] = semcol;
        //keyJButtons[KeyEvent] = button;

    }

    private void tone() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        wbutton = new javax.swing.JButton();
        ybutton = new javax.swing.JButton();
        tbutton = new javax.swing.JButton();
        qbutton = new javax.swing.JButton();
        ebutton = new javax.swing.JButton();
        rbutton = new javax.swing.JButton();
        ubutton = new javax.swing.JButton();
        ibutton = new javax.swing.JButton();
        obutton = new javax.swing.JButton();
        pbutton = new javax.swing.JButton();
        sbutton = new javax.swing.JButton();
        hbutton = new javax.swing.JButton();
        gbutton = new javax.swing.JButton();
        abutton = new javax.swing.JButton();
        dbutton = new javax.swing.JButton();
        fbutton = new javax.swing.JButton();
        jbutton = new javax.swing.JButton();
        kbutton = new javax.swing.JButton();
        lbutton = new javax.swing.JButton();
        xbutton = new javax.swing.JButton();
        nbutton = new javax.swing.JButton();
        bbutton = new javax.swing.JButton();
        zbutton = new javax.swing.JButton();
        cbutton = new javax.swing.JButton();
        vbutton = new javax.swing.JButton();
        mbutton = new javax.swing.JButton();
        sqlinebutton = new javax.swing.JButton();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        two = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        minbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        plusbutton = new javax.swing.JButton();
        tabbutton = new javax.swing.JButton();
        opbkt = new javax.swing.JButton();
        clbkt = new javax.swing.JButton();
        bkslsh = new javax.swing.JButton();
        capsbutton = new javax.swing.JButton();
        shiftbutton = new javax.swing.JButton();
        atbutton = new javax.swing.JButton();
        entbutton = new javax.swing.JButton();
        semcol = new javax.swing.JButton();
        stopbutton = new javax.swing.JButton();
        commabutton = new javax.swing.JButton();
        quebutton = new javax.swing.JButton();
        spbutton = new javax.swing.JButton();
        leftbutton = new javax.swing.JButton();
        downbutton = new javax.swing.JButton();
        rightbutton = new javax.swing.JButton();
        upbutton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        clearTextMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        buttonColorMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        textColorMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        boldCheckBox = new javax.swing.JCheckBoxMenuItem();
        italicCheckBox = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        size12Radio = new javax.swing.JRadioButtonMenuItem();
        size16Radio = new javax.swing.JRadioButtonMenuItem();
        size20Radio = new javax.swing.JRadioButtonMenuItem();
        jMenu9 = new javax.swing.JMenu();
        pianoMode = new javax.swing.JCheckBoxMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Type something");

        jta.setColumns(20);
        jta.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jta.setRows(5);
        jta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jtaComponentShown(evt);
            }
        });
        jta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jta);

        wbutton.setBackground(new java.awt.Color(204, 204, 204));
        wbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wbutton.setText("W");
        wbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbuttonActionPerformed(evt);
            }
        });

        ybutton.setBackground(new java.awt.Color(204, 204, 204));
        ybutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ybutton.setText("Y");
        ybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ybuttonActionPerformed(evt);
            }
        });

        tbutton.setBackground(new java.awt.Color(204, 204, 204));
        tbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbutton.setText("T");
        tbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbuttonActionPerformed(evt);
            }
        });

        qbutton.setBackground(new java.awt.Color(204, 204, 204));
        qbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qbutton.setText("Q");
        qbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qbuttonActionPerformed(evt);
            }
        });
        qbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qbuttonKeyPressed(evt);
            }
        });

        ebutton.setBackground(new java.awt.Color(204, 204, 204));
        ebutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ebutton.setText("E");
        ebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebuttonActionPerformed(evt);
            }
        });

        rbutton.setBackground(new java.awt.Color(204, 204, 204));
        rbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbutton.setText("R");
        rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttonActionPerformed(evt);
            }
        });

        ubutton.setBackground(new java.awt.Color(204, 204, 204));
        ubutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ubutton.setText("U");
        ubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubuttonActionPerformed(evt);
            }
        });

        ibutton.setBackground(new java.awt.Color(204, 204, 204));
        ibutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ibutton.setText("I");
        ibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibuttonActionPerformed(evt);
            }
        });

        obutton.setBackground(new java.awt.Color(204, 204, 204));
        obutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        obutton.setText("O");
        obutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obuttonActionPerformed(evt);
            }
        });

        pbutton.setBackground(new java.awt.Color(204, 204, 204));
        pbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pbutton.setText("P");
        pbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbuttonActionPerformed(evt);
            }
        });

        sbutton.setBackground(new java.awt.Color(204, 204, 204));
        sbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sbutton.setText("S");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });

        hbutton.setBackground(new java.awt.Color(204, 204, 204));
        hbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hbutton.setText("H");
        hbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbuttonActionPerformed(evt);
            }
        });

        gbutton.setBackground(new java.awt.Color(204, 204, 204));
        gbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gbutton.setText("G");
        gbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbuttonActionPerformed(evt);
            }
        });

        abutton.setBackground(new java.awt.Color(204, 204, 204));
        abutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        abutton.setText("A");
        abutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abuttonActionPerformed(evt);
            }
        });

        dbutton.setBackground(new java.awt.Color(204, 204, 204));
        dbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dbutton.setText("D");
        dbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbuttonActionPerformed(evt);
            }
        });

        fbutton.setBackground(new java.awt.Color(204, 204, 204));
        fbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fbutton.setText("F");
        fbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbuttonActionPerformed(evt);
            }
        });

        jbutton.setBackground(new java.awt.Color(204, 204, 204));
        jbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbutton.setText("J");
        jbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonActionPerformed(evt);
            }
        });

        kbutton.setBackground(new java.awt.Color(204, 204, 204));
        kbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kbutton.setText("K");
        kbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuttonActionPerformed(evt);
            }
        });

        lbutton.setBackground(new java.awt.Color(204, 204, 204));
        lbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbutton.setText("L");
        lbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbuttonActionPerformed(evt);
            }
        });

        xbutton.setBackground(new java.awt.Color(204, 204, 204));
        xbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xbutton.setText("X");
        xbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbuttonActionPerformed(evt);
            }
        });

        nbutton.setBackground(new java.awt.Color(204, 204, 204));
        nbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nbutton.setText("N");
        nbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbuttonActionPerformed(evt);
            }
        });

        bbutton.setBackground(new java.awt.Color(204, 204, 204));
        bbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bbutton.setText("B");
        bbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuttonActionPerformed(evt);
            }
        });

        zbutton.setBackground(new java.awt.Color(204, 204, 204));
        zbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zbutton.setText("Z");
        zbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zbuttonActionPerformed(evt);
            }
        });

        cbutton.setBackground(new java.awt.Color(204, 204, 204));
        cbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbutton.setText("C");
        cbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuttonActionPerformed(evt);
            }
        });

        vbutton.setBackground(new java.awt.Color(204, 204, 204));
        vbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vbutton.setText("V");
        vbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbuttonActionPerformed(evt);
            }
        });

        mbutton.setBackground(new java.awt.Color(204, 204, 204));
        mbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mbutton.setText("M");
        mbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbuttonActionPerformed(evt);
            }
        });

        sqlinebutton.setBackground(new java.awt.Color(204, 204, 204));
        sqlinebutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sqlinebutton.setText("`");
        sqlinebutton.setToolTipText("");
        sqlinebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqlinebuttonActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(204, 204, 204));
        four.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(204, 204, 204));
        seven.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(204, 204, 204));
        eight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(204, 204, 204));
        nine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(204, 204, 204));
        zero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(204, 204, 204));
        two.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(204, 204, 204));
        six.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(204, 204, 204));
        five.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(204, 204, 204));
        one.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(204, 204, 204));
        three.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        minbutton.setBackground(new java.awt.Color(204, 204, 204));
        minbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minbutton.setText("-");
        minbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minbuttonActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(204, 204, 204));
        backbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbutton.setText("Backspace");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        plusbutton.setBackground(new java.awt.Color(204, 204, 204));
        plusbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plusbutton.setText("+");
        plusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusbuttonActionPerformed(evt);
            }
        });

        tabbutton.setBackground(new java.awt.Color(204, 204, 204));
        tabbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabbutton.setText("Tab");
        tabbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabbuttonActionPerformed(evt);
            }
        });

        opbkt.setBackground(new java.awt.Color(204, 204, 204));
        opbkt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opbkt.setText("[");
        opbkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opbktActionPerformed(evt);
            }
        });

        clbkt.setBackground(new java.awt.Color(204, 204, 204));
        clbkt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clbkt.setText("]");
        clbkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clbktActionPerformed(evt);
            }
        });

        bkslsh.setBackground(new java.awt.Color(204, 204, 204));
        bkslsh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bkslsh.setText("\\");
            bkslsh.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bkslshActionPerformed(evt);
                }
            });

            capsbutton.setBackground(new java.awt.Color(204, 204, 204));
            capsbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            capsbutton.setText("Caps");
            capsbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    capsbuttonActionPerformed(evt);
                }
            });

            shiftbutton.setBackground(new java.awt.Color(204, 204, 204));
            shiftbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            shiftbutton.setText("Shift");
            shiftbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    shiftbuttonActionPerformed(evt);
                }
            });

            atbutton.setBackground(new java.awt.Color(204, 204, 204));
            atbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            atbutton.setText("'");
            atbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    atbuttonActionPerformed(evt);
                }
            });

            entbutton.setBackground(new java.awt.Color(204, 204, 204));
            entbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            entbutton.setText("Enter");
            entbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    entbuttonActionPerformed(evt);
                }
            });

            semcol.setBackground(new java.awt.Color(204, 204, 204));
            semcol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            semcol.setText(";");
            semcol.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    semcolActionPerformed(evt);
                }
            });

            stopbutton.setBackground(new java.awt.Color(204, 204, 204));
            stopbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            stopbutton.setText(".");
            stopbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stopbuttonActionPerformed(evt);
                }
            });

            commabutton.setBackground(new java.awt.Color(204, 204, 204));
            commabutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            commabutton.setText(",");
            commabutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    commabuttonActionPerformed(evt);
                }
            });

            quebutton.setBackground(new java.awt.Color(204, 204, 204));
            quebutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            quebutton.setText("?");
            quebutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    quebuttonActionPerformed(evt);
                }
            });

            spbutton.setBackground(new java.awt.Color(204, 204, 204));
            spbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            spbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    spbuttonActionPerformed(evt);
                }
            });
            spbutton.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    spbuttonKeyPressed(evt);
                }
            });

            leftbutton.setBackground(new java.awt.Color(204, 204, 204));
            leftbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            leftbutton.setText("←");
            leftbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    leftbuttonActionPerformed(evt);
                }
            });

            downbutton.setBackground(new java.awt.Color(204, 204, 204));
            downbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            downbutton.setText("↓");
            downbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    downbuttonActionPerformed(evt);
                }
            });

            rightbutton.setBackground(new java.awt.Color(204, 204, 204));
            rightbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            rightbutton.setText("→");
            rightbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rightbuttonActionPerformed(evt);
                }
            });

            upbutton.setBackground(new java.awt.Color(204, 204, 204));
            upbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            upbutton.setText("↑");
            upbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    upbuttonActionPerformed(evt);
                }
            });

            jMenu1.setText("Display");

            clearTextMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
            clearTextMenuItem.setText("Clear Text");
            clearTextMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clearTextMenuItemActionPerformed(evt);
                }
            });
            jMenu1.add(clearTextMenuItem);
            jMenu1.add(jSeparator2);

            buttonColorMenuItem.setText("Button Color");
            buttonColorMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonColorMenuItemActionPerformed(evt);
                }
            });
            jMenu1.add(buttonColorMenuItem);
            jMenu1.add(jSeparator3);

            textColorMenuItem.setText("Text Color");
            textColorMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textColorMenuItemActionPerformed(evt);
                }
            });
            jMenu1.add(textColorMenuItem);
            jMenu1.add(jSeparator5);

            jMenuBar1.add(jMenu1);

            jMenu2.setText("Format");
            jMenu2.add(jSeparator4);

            jMenu3.setText("Style");

            boldCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
            boldCheckBox.setText("Bold");
            boldCheckBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boldCheckBoxActionPerformed(evt);
                }
            });
            jMenu3.add(boldCheckBox);

            italicCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
            italicCheckBox.setText("Italic");
            italicCheckBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    italicCheckBoxActionPerformed(evt);
                }
            });
            jMenu3.add(italicCheckBox);

            jMenu2.add(jMenu3);

            jMenu4.setText("Size");

            btngrp.add(size12Radio);
            size12Radio.setSelected(true);
            size12Radio.setText("12");
            size12Radio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    size12RadioActionPerformed(evt);
                }
            });
            jMenu4.add(size12Radio);

            btngrp.add(size16Radio);
            size16Radio.setText("16");
            size16Radio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    size16RadioActionPerformed(evt);
                }
            });
            jMenu4.add(size16Radio);

            btngrp.add(size20Radio);
            size20Radio.setText("20");
            size20Radio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    size20RadioActionPerformed(evt);
                }
            });
            jMenu4.add(size20Radio);

            jMenu2.add(jMenu4);

            jMenuBar1.add(jMenu2);

            jMenu9.setText("Piano Mode");

            pianoMode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
            pianoMode.setText("On");
            pianoMode.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pianoModeActionPerformed(evt);
                }
            });
            jMenu9.add(pianoMode);

            jMenuBar1.add(jMenu9);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sqlinebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(minbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(plusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(backbutton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tabbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(qbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(wbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ibutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(obutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(opbkt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(clbkt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bkslsh, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(capsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(abutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(gbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(hbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(semcol, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(atbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(entbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(shiftbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(xbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(vbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(nbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(commabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(82, 82, 82)
                                            .addComponent(spbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(110, 110, 110)
                                            .addComponent(leftbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(stopbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(quebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(downbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rightbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(upbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sqlinebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(wbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ibutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(obutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tabbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opbkt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clbkt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bkslsh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(abutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(capsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(semcol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(atbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(entbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(xbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(shiftbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(commabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stopbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(upbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(leftbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(downbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void wbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wbuttonActionPerformed

    private void ybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ybuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ybuttonActionPerformed

    private void tbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbuttonActionPerformed

    private void qbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qbuttonActionPerformed

    }//GEN-LAST:event_qbuttonActionPerformed

    private void ebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ebuttonActionPerformed

    private void rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbuttonActionPerformed

    private void ubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubuttonActionPerformed

    private void ibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibuttonActionPerformed

    private void obuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obuttonActionPerformed

    private void pbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbuttonActionPerformed

    private void sbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbuttonActionPerformed

    private void hbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hbuttonActionPerformed

    private void gbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbuttonActionPerformed

    private void abuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abuttonActionPerformed

    private void dbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbuttonActionPerformed

    private void fbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fbuttonActionPerformed

    private void jbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonActionPerformed

    }//GEN-LAST:event_jbuttonActionPerformed

    private void kbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kbuttonActionPerformed

    private void lbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbuttonActionPerformed

    private void xbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xbuttonActionPerformed

    private void nbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbuttonActionPerformed

    private void bbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbuttonActionPerformed

    private void zbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zbuttonActionPerformed

    private void cbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbuttonActionPerformed

    private void vbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vbuttonActionPerformed

    private void mbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbuttonActionPerformed

    private void sqlinebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqlinebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqlinebuttonActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sixActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiveActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threeActionPerformed

    private void minbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

    private void plusbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusbuttonActionPerformed

    private void tabbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabbuttonActionPerformed

    private void opbktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opbktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opbktActionPerformed

    private void clbktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clbktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clbktActionPerformed

    private void bkslshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkslshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bkslshActionPerformed

    private void capsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capsbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capsbuttonActionPerformed

    private void shiftbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftbuttonActionPerformed

    private void atbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atbuttonActionPerformed

    private void entbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entbuttonActionPerformed

    private void semcolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semcolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semcolActionPerformed

    private void stopbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopbuttonActionPerformed

    private void commabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commabuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commabuttonActionPerformed

    private void quebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quebuttonActionPerformed

    private void spbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spbuttonActionPerformed

    }//GEN-LAST:event_spbuttonActionPerformed

    private void leftbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftbuttonActionPerformed

    private void downbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downbuttonActionPerformed

    private void rightbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightbuttonActionPerformed

    private void upbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upbuttonActionPerformed

    private void jtaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaKeyPressed
        JButton depressedButton = keyJButtons[evt.getKeyCode()];
        int i = evt.getKeyCode();
        if ((i == KeyEvent.VK_Q)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File C2 = new File("wavs\\c2.wav");
            PlaySound(C2);
        } 
        else if ((i == KeyEvent.VK_W)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File C2S = new File("wavs\\c-2.wav");
            PlaySound(C2S);
        } 
        else if ((i == KeyEvent.VK_E)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File D2 = new File("wavs\\d2.wav");
            PlaySound(D2);
        } else if ((i == KeyEvent.VK_R)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File D2S = new File("wavs\\d-2.wav");
            PlaySound(D2S);
        } 
        else if ((i == KeyEvent.VK_T)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File E2 = new File("wavs\\e2.wav");
            PlaySound(E2);
        } 
        else if ((i == KeyEvent.VK_Y)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File F2 = new File("wavs\\f2.wav");
            PlaySound(F2);
        } 
        else if ((i == KeyEvent.VK_U)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File F2S = new File("wavs\\f-2.wav");
            PlaySound(F2S);
        } 
        else if ((i == KeyEvent.VK_I)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File G2 = new File("wavs\\g2.wav");
            PlaySound(G2);
        } 
        else if ((i == KeyEvent.VK_O)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File G2S = new File("wavs\\g-2.wav");
            PlaySound(G2S);
        } 
        else if ((i == KeyEvent.VK_P)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File A2 = new File("wavs\\a2.wav");
            PlaySound(A2);
        }
        else if ((i == KeyEvent.VK_A)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File A2S = new File("wavs\\a-2.wav");
            PlaySound(A2S);
        }
        else if ((i == KeyEvent.VK_S)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File B2 = new File("wavs\\b2.wav");
            PlaySound(B2);
        }
        else if ((i == KeyEvent.VK_D)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File C3 = new File("wavs\\c3.wav");
            PlaySound(C3);
        }
        else if ((i == KeyEvent.VK_F)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File C3S = new File("wavs\\c-3.wav");
            PlaySound(C3S);
        }
        else if ((i == KeyEvent.VK_G)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File D3 = new File("wavs\\d3.wav");
            PlaySound(D3);
        }
        else if ((i == KeyEvent.VK_H)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File D3S = new File("wavs\\d-3.wav");
            PlaySound(D3S);
        }
        else if ((i == KeyEvent.VK_J)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File E3 = new File("wavs\\e3.wav");
            PlaySound(E3);
        }
        else if ((i == KeyEvent.VK_K)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File F3 = new File("wavs\\f3.wav");
            PlaySound(F3);
        }
        else if ((i == KeyEvent.VK_L)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File F3S = new File("wavs\\f-3.wav");
            PlaySound(F3S);
        }
        else if ((i == KeyEvent.VK_Z)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File G3 = new File("wavs\\g3.wav");
            PlaySound(G3);
        }
        else if ((i == KeyEvent.VK_X)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File G3S = new File("wavs\\g-3.wav");
            PlaySound(G3S);
        }
        else if ((i == KeyEvent.VK_C)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File A3 = new File("wavs\\a3.wav");
            PlaySound(A3);
        }
        else if ((i == KeyEvent.VK_V)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File A3S = new File("wavs\\a-3.wav");
            PlaySound(A3S);
        }
        else if ((i == KeyEvent.VK_B)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File B3 = new File("wavs\\b3.wav");
            PlaySound(B3);
        }
        else if ((i == KeyEvent.VK_N)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File C4 = new File("wavs\\c4.wav");
            PlaySound(C4);
        }
        else if ((i == KeyEvent.VK_M)&&(pianoMode.isSelected())) {
            depressedButton.setBackground(selectedButtonColor);
            File C4S = new File("wavs\\c-4.wav");
            PlaySound(C4S);
        }
        else {
            depressedButton.setBackground(selectedButtonColor);
        }
        
    }//GEN-LAST:event_jtaKeyPressed

    private void jtaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaKeyReleased
        JButton depressedButton = keyJButtons[evt.getKeyCode()];
        depressedButton.setBackground(Color.lightGray);
      


    }//GEN-LAST:event_jtaKeyReleased

    private void clearTextMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTextMenuItemActionPerformed
        jta.setText("");
    }//GEN-LAST:event_clearTextMenuItemActionPerformed

    private void textColorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColorMenuItemActionPerformed
        Color selectedColor = JColorChooser.showDialog(this, "Select a Colour", Color.yellow);
        jta.setForeground(selectedColor);
    }//GEN-LAST:event_textColorMenuItemActionPerformed

    private void buttonColorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorMenuItemActionPerformed
        selectedButtonColor = JColorChooser.showDialog(this, "Select a Colour", Color.yellow);
    }//GEN-LAST:event_buttonColorMenuItemActionPerformed

    private void size16RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size16RadioActionPerformed
        if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.BOLD + Font.ITALIC, 16);
            jta.setFont(font);
        } else if (!boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.ITALIC, 16);
            jta.setFont(font);
        } else if (boldCheckBox.isSelected() && !italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.BOLD, 16);
            jta.setFont(font);
        } else {
            font = new Font("MS Reference Sans Serif", Font.PLAIN, 16);
            jta.setFont(font);
        }
    }//GEN-LAST:event_size16RadioActionPerformed

    private void size12RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size12RadioActionPerformed

        if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.BOLD + Font.ITALIC, 12);
            jta.setFont(font);
        } else if (!boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.ITALIC, 12);
            jta.setFont(font);
        } else if (boldCheckBox.isSelected() && !italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.BOLD, 12);
            jta.setFont(font);
        } else {
            font = new Font("MS Reference Sans Serif", Font.PLAIN, 12);
            jta.setFont(font);
        }


    }//GEN-LAST:event_size12RadioActionPerformed

    private void size20RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size20RadioActionPerformed
        if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.BOLD + Font.ITALIC, 20);
            jta.setFont(font);
        } else if (!boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.ITALIC, 20);
            jta.setFont(font);
        } else if (boldCheckBox.isSelected() && !italicCheckBox.isSelected()) {
            font = new Font("MS Reference Sans Serif", Font.BOLD, 20);
            jta.setFont(font);
        } else {
            font = new Font("MS Reference Sans Serif", Font.PLAIN, 20);
            jta.setFont(font);
        }
    }//GEN-LAST:event_size20RadioActionPerformed

    private void boldCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldCheckBoxActionPerformed
        if (italicCheckBox.isSelected() && boldCheckBox.isSelected()) {
            jta.setFont(font.deriveFont(Font.BOLD + Font.ITALIC));
        } else if (!italicCheckBox.isSelected() && boldCheckBox.isSelected()) {
            jta.setFont(font.deriveFont(Font.BOLD));
        } else if (italicCheckBox.isSelected() && !boldCheckBox.isSelected()) {
            jta.setFont(font.deriveFont(Font.ITALIC));
        } else {
            jta.setFont(font.deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_boldCheckBoxActionPerformed

    private void italicCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicCheckBoxActionPerformed
        if (italicCheckBox.isSelected() && boldCheckBox.isSelected()) {
            jta.setFont(font.deriveFont(Font.BOLD + Font.ITALIC));
        } else if (italicCheckBox.isSelected() && !boldCheckBox.isSelected()) {
            jta.setFont(font.deriveFont(Font.ITALIC));
        } else if (!italicCheckBox.isSelected() && boldCheckBox.isSelected()) {
            jta.setFont(font.deriveFont(Font.BOLD));
        } else {
            jta.setFont(font.deriveFont(Font.PLAIN));
        }
    }//GEN-LAST:event_italicCheckBoxActionPerformed

    private void jtaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaKeyTyped

    private void jtaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jtaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaComponentShown

    private void spbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spbuttonKeyPressed

    }//GEN-LAST:event_spbuttonKeyPressed

    private void qbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qbuttonKeyPressed

    }//GEN-LAST:event_qbuttonKeyPressed

    private void pianoModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pianoModeActionPerformed
        
    }//GEN-LAST:event_pianoModeActionPerformed

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
            java.util.logging.Logger.getLogger(TypingTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypingTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypingTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypingTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypingTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abutton;
    private javax.swing.JButton atbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton bbutton;
    private javax.swing.JButton bkslsh;
    private javax.swing.JCheckBoxMenuItem boldCheckBox;
    private javax.swing.ButtonGroup btngrp;
    private javax.swing.JMenuItem buttonColorMenuItem;
    private javax.swing.JButton capsbutton;
    private javax.swing.JButton cbutton;
    private javax.swing.JButton clbkt;
    private javax.swing.JMenuItem clearTextMenuItem;
    private javax.swing.JButton commabutton;
    private javax.swing.JButton dbutton;
    private javax.swing.JButton downbutton;
    private javax.swing.JButton ebutton;
    private javax.swing.JButton eight;
    private javax.swing.JButton entbutton;
    private javax.swing.JButton fbutton;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton gbutton;
    private javax.swing.JButton hbutton;
    private javax.swing.JButton ibutton;
    private javax.swing.JCheckBoxMenuItem italicCheckBox;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JButton jbutton;
    private javax.swing.JTextArea jta;
    private javax.swing.JButton kbutton;
    private javax.swing.JButton lbutton;
    private javax.swing.JButton leftbutton;
    private javax.swing.JButton mbutton;
    private javax.swing.JButton minbutton;
    private javax.swing.JButton nbutton;
    private javax.swing.JButton nine;
    private javax.swing.JButton obutton;
    private javax.swing.JButton one;
    private javax.swing.JButton opbkt;
    private javax.swing.JButton pbutton;
    private javax.swing.JCheckBoxMenuItem pianoMode;
    private javax.swing.JButton plusbutton;
    private javax.swing.JButton qbutton;
    private javax.swing.JButton quebutton;
    private javax.swing.JButton rbutton;
    private javax.swing.JButton rightbutton;
    private javax.swing.JButton sbutton;
    private javax.swing.JButton semcol;
    private javax.swing.JButton seven;
    private javax.swing.JButton shiftbutton;
    private javax.swing.JButton six;
    private javax.swing.JRadioButtonMenuItem size12Radio;
    private javax.swing.JRadioButtonMenuItem size16Radio;
    private javax.swing.JRadioButtonMenuItem size20Radio;
    private javax.swing.JButton spbutton;
    private javax.swing.JButton sqlinebutton;
    private javax.swing.JButton stopbutton;
    private javax.swing.JButton tabbutton;
    private javax.swing.JButton tbutton;
    private javax.swing.JMenuItem textColorMenuItem;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton ubutton;
    private javax.swing.JButton upbutton;
    private javax.swing.JButton vbutton;
    private javax.swing.JButton wbutton;
    private javax.swing.JButton xbutton;
    private javax.swing.JButton ybutton;
    private javax.swing.JButton zbutton;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

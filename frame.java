import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
//import java.util.Formatter;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class frame extends JFrame
{
    private JMenuBar mmenu;
    private JMenu file,edit;
    private JMenuItem nw,opn,undo,redo;
    private JTextField txtName,txtFname,txtAddress;
    private JLabel lbName,lbFname,lbAddress,lbmain;
    private JButton btnAdd,btnDel,btnUpdate,btnRead;
    public void intialize()
    {
        mmenu=new JMenuBar();
        file=new JMenu("File");
        mmenu.add(file);
        nw=new JMenuItem("New");
        nw.addActionListener(new menuClickEven());
        file.add(nw);
        opn=new JMenuItem("Open");
        opn.addActionListener(new menuClickEven());
        file.add(opn);
        
        edit=new JMenu("Edit");
        mmenu.add(edit);
        undo=new JMenuItem("Undo");
        undo.addActionListener(new menuClickEven());
        edit.add(undo);
        
        redo=new JMenuItem("Redo");
        edit.add(redo);
        redo.addActionListener(new menuClickEven());
        
        
        
        
        this.setJMenuBar(mmenu);
        
        
        Font f=new Font("Times New Roman",Font.PLAIN,24);
        lbName=new JLabel("Name");
        lbName.setFont(f);
        lbName.setBounds(10,10,80,40);
        this.add(lbName);
        
        txtName=new JTextField();
        txtName.setFont(f);
        txtName.setBounds(180,10,200,40);
        this.add(txtName);
        
        lbFname=new JLabel("Father Name");
        lbFname.setFont(f);
        lbFname.setBounds(10,60,140,40);
        this.add(lbFname);
         
        txtFname=new JTextField();
        txtFname.setFont(f);
        txtFname.setBounds(180,60,200,40);
        this.add(txtFname);
        
        lbAddress=new JLabel("Address");
        lbAddress.setFont(f);
        lbAddress.setBounds(10,120,140,40);
        this.add(lbAddress);
        
        txtAddress=new JTextField();
        txtAddress.setFont(f);
        txtAddress.setBounds(180,120,200,40);
        this.add(txtAddress);
        
        btnAdd=new JButton("Add");
        btnAdd.setFont(f);
        btnAdd.setBounds(10,240,120,40);
        btnAdd.addActionListener(new btnEventHandler());
        this.add(btnAdd);
        
        btnRead=new JButton("Read");
        btnRead.setFont(f);
        btnRead.setBounds(140,240,120,40);
        btnRead.addActionListener(new btnEventHandler());
        this.add(btnRead);
        
        btnDel=new JButton("Delete");
        btnDel.setFont(f);
        btnDel.setBounds(270,240,120,40);
        btnDel.addActionListener(new btnEventHandler());
        this.add(btnDel);
        
        btnUpdate=new JButton("Remove");
        btnUpdate.setFont(f);
        btnUpdate.setBounds(400,240,120,40);
        btnUpdate.addActionListener(new btnEventHandler());
        this.add(btnUpdate);
        
        lbmain=new JLabel();
        lbmain.setFont(f);
        lbmain.setForeground(Color.RED);
        lbmain.setBounds(10,350,400,80);
        this.add(lbmain);
        
    }
    
    public class menuClickEven implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            System.out.println(ae.getActionCommand());
        }
        
    }
    
    public class btnEventHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
        try
        {
            String op=ae.getActionCommand();
            if(op.compareTo("Add")==0)
            {
                FileWriter f=new FileWriter("stud.txt",true);
                f.write(txtName.getText()+","+txtFname.getText()+","+txtAddress.getText()+"\n");
                f.close();
                lbmain.setText("Record Added Sucessfully");
            }
            if(op.compareTo("Read")==0)
            {
                File f=new File("stud.txt");
                Scanner input=new Scanner(f);
                String data="";
                while(input.hasNext())
                {
                    data+=input.nextLine()+"\n";
                }
                System.out.println(data);
                input.close();
                lbmain.setText("Record Read");
            }
            else
            if(op.compareTo("Delete")==0)
            {
                int flg=0;
                FileWriter fw=new FileWriter("temp.txt");
                File f=new File("stud.txt");
                Scanner input=new Scanner(f);
                while(input.hasNext())
                {
                    String str=input.nextLine();
                    String [] data=str.split(",");
                    if(data[0].compareTo(txtName.getText())==0)
                    {
                        flg=1;
                    }
                    else
                    {
                        fw.write(str+"\n");
                    }
                }
                fw.close();
                input.close();
                File f3=new File("stud.txt");
                f3.delete();
                File f2=new File("temp.txt");
                f2.renameTo(new File("stud.txt"));
                input.close();
                
               
                if(flg==0)
                {
                   lbmain.setText("Record Not Found"); 
                }
                else
                {
                lbmain.setText("Record Deleted");
                }
            }
            else
            if(op.compareTo("Remove")==0)
            {
                File f=new File("stud.txt");
                 if(f.delete())
                 {
                    lbmain.setText("File Removed");
                 }
                 else
                 {
                    lbmain.setText("File Not Found"); 
                 }
            }
        }
        catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
       }
        
    }
}
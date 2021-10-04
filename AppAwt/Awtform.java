package app;

//Aula 3: Interfaces com AWT
// Jennifer

// Import
import java.awt.*;

public class Awtform  extends  Frame {
	 //Initialising Elements
	
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	TextField tf1,tf2,tf3;
	CheckboxGroup cg;
	Choice ch1,ch2,ch3,ch4;
	TextArea txt;
	List ls1;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	Button b1,b2,b3;
	
	public Awtform() {
		
		setLayout(null);
		l1 = new Label("CADASTRO ALUNO");
		l2 = new Label("Nome:");
		tf1 = new TextField(20);
		
		l3 = new Label("RA:");
		tf2 = new TextField(15);
		
		l4 = new Label("Sexo:");
		cg = new CheckboxGroup();
		cb7 = new Checkbox("Masculino",cg,false);
		cb8 = new Checkbox("Femino",cg,false);
		
		l5 = new Label("Email:");
		tf3 = new TextField(15);
		
		l6 = new Label("Instituição:");
		ls1 = new List(3);
		ls1.add("Brasília");
		ls1.add("São Paulo");
		ls1.add("Acre");
		
		l8 = new Label("Data:");
		ch1 = new Choice();
		for(int i=1;i<=31;i++)
		{
			ch1.add(i+"");
		}
		ch2 = new Choice();
		ch2.add("Janeiro");
		ch2.add("Fevereiro");
		ch2.add("Março");
		ch2.add("Abril");
		ch2.add("Maio");
		ch2.add("Junho");
		ch2.add("Julho");
		ch2.add("Agosto");
		ch2.add("Setembro");
		ch2.add("Outubro");
		ch2.add("Novembro");
		ch2.add("Dezembro");
		ch3 = new Choice();
		for(int i=1990;i<=2021;i++)
		{
			ch3.add(i+"");
		}
		
		l7 = new Label("UF");
		ch4 = new Choice();
		ch4.add("ES");
		ch4.add("DF");
		ch4.add("GO");
		ch4.add("MG");
		ch4.add("PI");
		ch4.add("CE");
		ch4.add("BH");
		
		l9 = new Label("Ano");
		cb1 = new Checkbox("2021");
		cb2 = new Checkbox("2022");
		cb3 = new Checkbox("2023");
		cb4 = new Checkbox("2024");
		
		l10 = new Label("Endereço");
		txt = new TextArea();
		
		l11 = new Label("Formação");
		cb5 = new Checkbox("Licenciatura");
		cb6 = new Checkbox("Graduação");
		
		b1 = new Button("Enviar");
		b2 = new Button("Limpar");
		b3 = new Button("Sair");
		
		//adding Elements
		add(l1);
		add(l2);
		add(tf1);
		
		add(l3);
		add(tf2);
		
		add(l4);
		add(cb7);
		add(cb8);
		
		add(l5);
		add(tf3);
		
		add(l6);
		add(ls1);
		
		add(l8);
		add(ch1);
		add(ch2);
		add(ch3);
		
		add(l9);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		
		add(l10);
		add(txt);
		
		add(l11);
		add(cb5);
		add(cb6);
		
		
		add(l7);
		add(ch4);
		
		add(b1);
		add(b2);
		add(b3);
		
		l1.setBounds(200,100,150,50);
		l2.setBounds(150,160,80,20);
		tf1.setBounds(270,160,100,20);
		
		l3.setBounds(150,190,80,20);
		tf2.setBounds(270,190,100,20);
		
		l4.setBounds(150,220,80,20);
		cb7.setBounds(270,220,60,20);
		cb8.setBounds(350,220,60,20);
		
		l5.setBounds(150,250,60,20);
		tf3.setBounds(270,250,100,20);
		
		l6.setBounds(150,280,100,20);
		ls1.setBounds(270,280,50,50);
		
		l8.setBounds(150,340,60,20);
		ch1.setBounds(270,340,50,20);
		ch2.setBounds(340,340,80,20);
		ch3.setBounds(440,340,50,20);
		
		l7.setBounds(150,370,50,20);
		ch4.setBounds(270,370,50,20);
		
		l9.setBounds(150,400,100,20);
		cb1.setBounds(270,400,50,20);
		cb2.setBounds(340,400,50,20);
		cb3.setBounds(410,400,50,20);
		cb4.setBounds(480,400,50,20);
		
		l10.setBounds(150,430,80,20);
		txt.setBounds(270,430,100,50);
		
		l11.setBounds(150,490,100,20);
		cb5.setBounds(270,490,80,20);
		cb6.setBounds(370,490,80,20);
		
		b1.setBounds(120,520,80,30);
		b2.setBounds(220,520,80,30);
		b3.setBounds(330,520,80,30);
		
		
	}
	
  public static void main(String[] args) {
			
			   Awtform f1=new Awtform();
			   f1.setTitle("Awtform");
			   f1.setSize(600,600);
			   f1.setVisible(true);
			   f1.setBackground(Color.blue);
	
}
}

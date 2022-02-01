package ec.edu.ups.pweb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {
	
	private static final QName SERVICE_NAME = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "ServiceSOAPService");
	
	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField txtAutor;
	public static ServiceSOAPService ss ;
    public static ServiceSOAP port;
    public List<Obra> obras;
	/**
	 * Launch the application.
	 */
	
	
	public void conectar() {
		
	}
	
	public static void main(String[] args) {
		
		
		URL wsdlURL = ServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ss = new ServiceSOAPService(wsdlURL, SERVICE_NAME);
        port = ss.getServiceSOAPPort();
        
        
        
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(5, 5, 424, 251);
		contentPane.add(tabbedPane);
		
		JPanel Ingreso = new JPanel();
		tabbedPane.addTab("Ingreso", null, Ingreso, null);
		Ingreso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setBounds(10, 22, 53, 14);
		Ingreso.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descripcion");
		lblNewLabel_1.setBounds(10, 47, 61, 14);
		Ingreso.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(10, 72, 61, 14);
		Ingreso.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(81, 19, 86, 20);
		Ingreso.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(81, 44, 86, 20);
		Ingreso.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(81, 69, 86, 20);
		Ingreso.add(txtAutor);
		txtAutor.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ec.edu.ups.pweb.Obra obra = null;
				int id = 0;
				String nombre = txtNombre.getText() ;
				String descripcion = txtDescripcion.getText() ;
				String autor = txtAutor.getText() ;
				obra = new Obra();
				obra.setId(id);
				obra.setNombre(nombre);
				obra.setDescripcion(descripcion);
				obra.setAutor(autor);
		        boolean _insertarObra__return = port.insertarObra(obra);
		        if(_insertarObra__return) {
		        	txtAutor.setText("");
		        	txtDescripcion.setText("");
		        	txtNombre.setText("");
		        	table.setModel(listarObras());
		        	System.out.println("insertado ok");
		        }else {
		        	System.out.println("error en insertar");
		        }
				
			
			}
		});
		btnNewButton.setBounds(67, 122, 89, 23);
		Ingreso.add(btnNewButton);
		
		JPanel listado = new JPanel();
		tabbedPane.addTab("Listado", null, listado, null);
		listado.setLayout(null);
		
		table = new JTable();
		table.setBounds(31, 57, 308, 163);
		table.setModel(listarObras());
		listado.add(table);
	}
	
	public DefaultTableModel listarObras() {
		
		java.util.List<ec.edu.ups.pweb.Obra> obras = port.getObras();
        
		DefaultTableModel modelo = new DefaultTableModel();
		String header[] = new String[] { "id", "nombre", "descripcion", "autor"};
		modelo.setColumnIdentifiers(header);
		for(int i = 0; i < obras.size(); i++) {
			modelo.addRow(new Object[] {obras.get(i).getId(), obras.get(i).getNombre(), obras.get(i).getDescripcion(), obras.get(i).getAutor()});
		}
		return modelo;
	}
	
}

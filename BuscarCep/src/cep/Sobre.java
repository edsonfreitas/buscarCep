package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setTitle("Sobre");
		setResizable(false);
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Vers\u00E3o 1.0.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 30, 300, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author- Edson Arruda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 70, 300, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 110, 90, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("Republica Virtual");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWebService.setBounds(130, 110, 200, 20);
		getContentPane().add(lblWebService);
		
		JButton btnGitbub = new JButton("");
		btnGitbub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/edsonfreitas/buscarCep/");
			}
		});
		btnGitbub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitbub.setBorder(null);
		btnGitbub.setBackground(SystemColor.control);
		btnGitbub.setToolTipText("GitHub");
		btnGitbub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitbub.setBounds(30, 180, 48, 48);
		getContentPane().add(btnGitbub);
		
		JButton btnYoutube = new JButton("");
		btnYoutube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.youtube.com/channel/UCjjsevnFFN9bpQQZoR1kAhg");
			}
		});
		btnYoutube.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYoutube.setToolTipText("YouTube");
		btnYoutube.setBackground(SystemColor.control);
		btnYoutube.setIcon(new ImageIcon(Sobre.class.getResource("/img/youtube.png")));
		btnYoutube.setBorder(null);
		btnYoutube.setBounds(110, 180, 48, 48);
		getContentPane().add(btnYoutube);

	}//FIM CONSTRUTOR
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}

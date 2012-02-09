package com.parking;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.TableColumn;

public class Parking {

	protected Shell shell;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Parking window = new Parking();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(516, 470);
		shell.setText("SWT Application");
		
		Button btnPark = new Button(shell, SWT.NONE);
		btnPark.setBounds(0, 74, 119, 23);
		btnPark.setText("Parko");
		
		Button btnCparko = new Button(shell, SWT.NONE);
		btnCparko.setBounds(0, 116, 119, 23);
		btnCparko.setText("Cparko");
		
		Button btnKonsulto = new Button(shell, SWT.NONE);
		btnKonsulto.setText("Konsulto");
		btnKonsulto.setBounds(0, 164, 119, 23);
		
		Button btnVizualizo = new Button(shell, SWT.NONE);
		btnVizualizo.setBounds(0, 216, 119, 23);
		btnVizualizo.setText("Vizualizo");
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.setBounds(0, 264, 119, 23);
		btnExit.setText("EXIT");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 304, 508, 122);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnIdMakines = new TableColumn(table, SWT.NONE);
		tblclmnIdMakines.setWidth(100);
		tblclmnIdMakines.setText("ID Makines");
		
		TableColumn tblclmnOraEHyrjes = new TableColumn(table, SWT.NONE);
		tblclmnOraEHyrjes.setWidth(132);
		tblclmnOraEHyrjes.setText("Ora e Hyrjes ne radhe");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Tahoma", 12, SWT.BOLD));
		lblNewLabel.setBounds(211, 275, 143, 23);
		lblNewLabel.setText("Makinat ne radhe");

	}
}

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoginGUI {

	protected Shell shell;
	private Text txtPassword;
	private Text txtUsername;
	private Label lblUsername;
	private Label lblPassword;
	private Button btnLogin_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoginGUI window = new LoginGUI();
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
		shell.setSize(500, 330);
		shell.setText("SWT Application");
		
		Label lblLogin = new Label(shell, SWT.NONE);
		lblLogin.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		lblLogin.setAlignment(SWT.CENTER);
		lblLogin.setBounds(191, 23, 90, 30);
		lblLogin.setText("LOGIN");
		
		txtPassword = new Text(shell, SWT.BORDER);
		txtPassword.setBounds(131, 159, 222, 30);
		
		txtUsername = new Text(shell, SWT.BORDER);
		txtUsername.setBounds(131, 86, 222, 30);
		
		Button btnLogin = new Button(shell, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("TESTT JANCOK");
			}
		});
		btnLogin.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnLogin.setBounds(246, 219, 107, 30);
		btnLogin.setText("LOGIN");
		
		lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(209, 65, 55, 15);
		lblUsername.setText("Username");
		
		lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(211, 142, 55, 15);
		lblPassword.setText("Password");
		
		btnLogin_1 = new Button(shell, SWT.NONE);
		btnLogin_1.setText("SIGN UP");
		btnLogin_1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnLogin_1.setBounds(131, 219, 107, 30);

	}
}

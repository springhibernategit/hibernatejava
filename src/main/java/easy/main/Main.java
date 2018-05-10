package easy.main;

import javax.swing.JOptionPane;

import easy.menu.processes.MenuAdministratorProcess;
import easy.users.Role;
import easy.users.UserRepository;
import easy.view.JOptionPaneView;

public class Main {

	private UserRepository userRepository;

	public static void main(String[] args) {
		Main main = new Main();

	}

	public Main() {

		userRepository = new UserRepository();
		userRepository.openEntityManagerFactory();

		userRepository.inItData();
		String input = JOptionPaneView.logInScreen();
		Role role = userRepository.findRoleByUserPassword(input);

		if (role == Role.ADMINISTRATOR) {
			int menuAdministrator = JOptionPaneView.menu(new String[] { "Start selling", "File Paths",
					"Employee managment", "Export of receipts", "Update Prices", "Exit" }, "Easy-Sale Administrator Panel");
			MenuAdministratorProcess menuAdministratorProcess = new MenuAdministratorProcess();
			menuAdministratorProcess.process(menuAdministrator);

		} else if (role == Role.CASHIER) {
			int menuCashier = JOptionPaneView.menu(new String[] { "Start selling", "Update prices",
					"Export of receipts", "Finish the sale", "Exit",},"Easy-Sale Cashier Module");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect username or password");
		}

		userRepository.closeEntityManagerFactory();

	}
}

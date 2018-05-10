package easy.menu.processes;

import javax.swing.JOptionPane;

import easy.users.UserRepository;
import easy.view.JOptionPaneView;

public class MenuAdministratorProcess {
	

	public static void process(int menuAdministrator) {
		UserRepository userRepository = new UserRepository();

		switch (menuAdministrator) {
		case 0:
			JOptionPane.showMessageDialog(null, "RAZ");
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "DWA!!!!!!!");
			break;

		case 2:
			int optionsOfEmployeeManagment = JOptionPaneView.administratorPanel(
					new String[] { "Add User", "Search User", "Delete User", "Update User", "Return" },
					"Choose option:");

			switch (optionsOfEmployeeManagment) {

			case 0:
			userRepository.addUserToDataBase();
				break;

			case 1:
				JOptionPane.showMessageDialog(null, "test1");
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "test2");
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "test3");
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "test4");
				break;

			}

			break;

		case 3:
			JOptionPane.showMessageDialog(null, "Cztery");
			break;

		case 4:

			System.exit(0);
			break;

		}

	}

}

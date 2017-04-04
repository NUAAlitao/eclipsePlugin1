package nuaa.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class MySample extends AbstractHandler{
	public Object execute(ExecutionEvent event) throws ExecutionException{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		MessageDialog.openInformation(
				window.getShell(),
				"litao",
				"This is my first try");
		return null;
	}
}

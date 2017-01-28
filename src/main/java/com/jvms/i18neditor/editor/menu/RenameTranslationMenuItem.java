package com.jvms.i18neditor.editor.menu;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import com.jvms.i18neditor.editor.Editor;
import com.jvms.i18neditor.util.MessageBundle;

/**
 * This class represents a menu item for renaming a translation key.
 * 
 * @author Jacob
 */
public class RenameTranslationMenuItem extends JMenuItem {
	private final static long serialVersionUID = 907122077814626286L;

	public RenameTranslationMenuItem(Editor editor, boolean enabled) {
        super(MessageBundle.get("menu.edit.rename.title"));
        setAccelerator(KeyStroke.getKeyStroke("F2"));
		addActionListener(e -> editor.renameSelectedTranslation());
		setEnabled(enabled);
	}
}
/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.workbench.renderers.fx.services;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.Control;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.efxclipse.runtime.services.PopupMenuService;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPopupMenu;

@SuppressWarnings("restriction")
public class PartPopupMenuServiceImpl implements PopupMenuService<Control> {
	@Inject
	private MPart part;

	@Override
	public void registerContextMenu(Control widget, String id) {
		for (MMenu mmenu : part.getMenus()) {
			if (id.equals(mmenu.getElementId()) && mmenu instanceof MPopupMenu) {
				ContextMenu menu = registerMenu(widget, (MPopupMenu) mmenu, part);
				if (menu != null) {
					widget.setContextMenu(menu);
				}
			}
		}
	}

	private ContextMenu registerMenu(Control widget, MPopupMenu menu, MPart part) {
		if( menu.getWidget() != null ) {
			return (ContextMenu) menu.getWidget();
		}
		
		IPresentationEngine engine = part.getContext().get(IPresentationEngine.class);
		return (ContextMenu) ( (WPopupMenu<ContextMenu>) engine.createGui(menu)).getWidget();
	}

}

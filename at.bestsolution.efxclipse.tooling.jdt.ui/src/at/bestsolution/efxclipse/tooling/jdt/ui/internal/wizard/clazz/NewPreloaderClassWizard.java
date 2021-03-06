/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.clazz;

import org.eclipse.core.resources.ResourcesPlugin;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.PreloaderClassGenerator;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;

/**
 * @author Tom Schindl
 *
 */
public class NewPreloaderClassWizard extends AbstractNewClassWizard<JDTElement> {

	@Override
	public void addPages() {
		addPage(new NewPreloaderClassPage(root,fragment,ResourcesPlugin.getWorkspace().getRoot()));
	}
	
	
	@Override
	protected IGenerator<JDTElement> getGenerator() {
		return new PreloaderClassGenerator();
	}

}

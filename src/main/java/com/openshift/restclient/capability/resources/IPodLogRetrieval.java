/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package com.openshift.restclient.capability.resources;

import java.io.InputStream;

import com.openshift.restclient.capability.ICapability;

/**
 * 
 * @author Jeff Cantrill
 *
 */
public interface IPodLogRetrieval extends ICapability {
	
	
	/**
	 * Return the logs from the pod, optionally following them
	 * @param   follow  true; if following, Default: false
	 * @return  the log output stream
	 */
	InputStream getLogs(boolean follow);

	/**
	 * Return the logs from the pod, optionally following them
	 * @param   follow  true; if following, Default: false
	 * @param  container   the name of the container in the pod to get logs
	 *                     uses the first container if empty
	 * @return  the log output stream
	 */
	InputStream getLogs(boolean follow, String container);
	
	/**
	 * Stop retrieving logs for all containers
	 */
	void stop();

	/**
	 * Stop retrieving logs for a specific container
	 */
	void stop(String container);

}

//
//  CoreStatelessComponent.java
//  CoreFramework
//
//  Created by Gavin Eadie on 8/12/05.
//  Copyright (c) 2005 Ramsay Consulting. All rights reserved.
//

package com.ramsayconz.wocore.woc;

import org.apache.log4j.Logger;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;

/**
 * This subclass does little more than WOComponent, only it is stateless and provides access to the properties ...
 * 
 * @author gavin
 */

public class CoreStatelessComponent extends WOComponent {
    private static final Logger     logger = Logger.getLogger (CoreStatelessComponent.class);

    public CoreStatelessComponent(WOContext context) {
        super(context);
        logger.trace("+++ constructor");
    }

    /** 
     * Make the component stateless and non-synchronizing.
     */
    
    @Override
	public boolean isStateless() {
        return true;
    }
    
    /** 
     * provide a method to null out all instance variables.
     */

    @Override
	public void reset () {
		super.reset();
    }
}
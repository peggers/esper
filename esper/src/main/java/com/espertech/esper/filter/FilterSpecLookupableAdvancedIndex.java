/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.filter;

import com.espertech.esper.client.EventPropertyGetter;
import com.espertech.esper.epl.index.quadtree.AdvancedIndexConfigContextPartitionQuadTree;

public class FilterSpecLookupableAdvancedIndex extends FilterSpecLookupable {
    private final AdvancedIndexConfigContextPartitionQuadTree quadTreeConfig;
    private final EventPropertyGetter x;
    private final EventPropertyGetter y;
    private final EventPropertyGetter width;
    private final EventPropertyGetter height;

    public FilterSpecLookupableAdvancedIndex(String expression, EventPropertyGetter getter, Class returnType, AdvancedIndexConfigContextPartitionQuadTree quadTreeConfig, EventPropertyGetter x, EventPropertyGetter y, EventPropertyGetter width, EventPropertyGetter height) {
        super(expression, getter, returnType, true);
        this.quadTreeConfig = quadTreeConfig;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public EventPropertyGetter getX() {
        return x;
    }

    public EventPropertyGetter getY() {
        return y;
    }

    public EventPropertyGetter getWidth() {
        return width;
    }

    public EventPropertyGetter getHeight() {
        return height;
    }

    public AdvancedIndexConfigContextPartitionQuadTree getQuadTreeConfig() {
        return quadTreeConfig;
    }
}



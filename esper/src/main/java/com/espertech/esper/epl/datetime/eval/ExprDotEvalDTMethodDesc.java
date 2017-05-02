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
package com.espertech.esper.epl.datetime.eval;

import com.espertech.esper.epl.expression.dot.ExprDotEval;
import com.espertech.esper.epl.join.plan.FilterExprAnalyzerAffector;
import com.espertech.esper.epl.rettype.EPType;

public class ExprDotEvalDTMethodDesc {

    private final ExprDotEval eval;
    private final EPType returnType;
    private final FilterExprAnalyzerAffector intervalFilterDesc;

    public ExprDotEvalDTMethodDesc(ExprDotEval eval, EPType returnType, FilterExprAnalyzerAffector intervalFilterDesc) {
        this.eval = eval;
        this.returnType = returnType;
        this.intervalFilterDesc = intervalFilterDesc;
    }

    public ExprDotEval getEval() {
        return eval;
    }

    public EPType getReturnType() {
        return returnType;
    }

    public FilterExprAnalyzerAffector getIntervalFilterDesc() {
        return intervalFilterDesc;
    }
}

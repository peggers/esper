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
package com.espertech.esper.epl.datetime.reformatop;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.EventType;
import com.espertech.esper.epl.datetime.eval.DatetimeMethodEnum;
import com.espertech.esper.epl.join.plan.FilterExprAnalyzerAffector;
import com.espertech.esper.epl.expression.core.ExprEvaluatorContext;
import com.espertech.esper.epl.expression.core.ExprNode;
import com.espertech.esper.epl.expression.dot.ExprDotNodeFilterAnalyzerInput;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface ReformatOp {
    public Object evaluate(Long ts, EventBean[] eventsPerStream, boolean newData, ExprEvaluatorContext exprEvaluatorContext);

    public Object evaluate(Date d, EventBean[] eventsPerStream, boolean newData, ExprEvaluatorContext exprEvaluatorContext);

    public Object evaluate(Calendar cal, EventBean[] eventsPerStream, boolean newData, ExprEvaluatorContext exprEvaluatorContext);

    public Object evaluate(LocalDateTime ldt, EventBean[] eventsPerStream, boolean newData, ExprEvaluatorContext exprEvaluatorContext);

    public Object evaluate(ZonedDateTime zdt, EventBean[] eventsPerStream, boolean newData, ExprEvaluatorContext exprEvaluatorContext);

    public Class getReturnType();

    public FilterExprAnalyzerAffector getFilterDesc(EventType[] typesPerStream, DatetimeMethodEnum currentMethod, List<ExprNode> currentParameters, ExprDotNodeFilterAnalyzerInput inputDesc);
}

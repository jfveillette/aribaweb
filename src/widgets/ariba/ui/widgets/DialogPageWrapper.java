/*
    Copyright 1996-2008 Ariba, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    $Id: //ariba/platform/ui/widgets/ariba/ui/widgets/DialogPageWrapper.java#11 $
*/

package ariba.ui.widgets;

import ariba.ui.aribaweb.core.AWComponent;
import ariba.ui.aribaweb.core.AWRequestContext;
import ariba.ui.widgets.ActionHandler;
import ariba.ui.widgets.ActionInterceptor;

public final class DialogPageWrapper extends AWComponent implements ActionInterceptor
{
    public final static ActionHandler DisabledActionHandler =
        new ActionHandler(false, true, null);

    /**
        Action interceptor interface
    */
    public ActionHandler overrideAction (String action,
                                         ActionHandler defaultHandler,
                                         AWRequestContext requestContext)
    {
        return DisabledActionHandler;
    }
}

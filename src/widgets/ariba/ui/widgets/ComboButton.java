/*
    Copyright 1996-2012 Ariba, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    $Id: //ariba/platform/ui/widgets/ariba/ui/widgets/ComboButton.java#1 $
*/
package ariba.ui.widgets;

import ariba.ui.aribaweb.core.AWComponent;
import ariba.ui.aribaweb.util.AWEncodedString;

public class ComboButton extends AWComponent
{
    public AWEncodedString _elementId;

    @Override
    protected void awake ()
    {
        super.awake();
        _elementId = requestContext().nextElementId();
    }

    @Override
    protected void sleep ()
    {
        super.sleep();
        _elementId = null;
    }
}

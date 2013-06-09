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

    $Id: //ariba/platform/ui/widgets/ariba/ui/validation/ValidatingTabSet.java#2 $
*/
package ariba.ui.validation;

import ariba.ui.widgets.TabSet;
import ariba.ui.aribaweb.core.AWComponent;
import ariba.ui.aribaweb.core.AWBinding;
import ariba.ui.aribaweb.core.AWComponentReference;
import ariba.ui.aribaweb.core.AWComponentDefinition;
import ariba.ui.aribaweb.core.AWNavigation;

// If this is handled in a different way, put final back on TabSet
public final class ValidatingTabSet extends TabSet
{
    private static final String AllowSwitch = "allowSwitch";
    private static final String TemplateName = AWComponentDefinition.computeTemplateName(TabSet.class);

    protected boolean canSwitch ()
    {
        AWBinding binding = bindingForName(AllowSwitch);
        if (binding != null) {
            return booleanValueForBinding(binding);
        } else {
            AWComponent r = AWNavigation.requestNavigation(this, AWNavigation.Hide);
            return (r == null);
        }
    }

    public void setSelectedTab (AWComponentReference tab) {
        // abort tab swtich if parent tells us to
        if (canSwitch()) {
            super.setSelectedTab(tab);
        }
    }

    // So the framework uses TabSet's template
    public String templateName ()
    {
        return TemplateName;
    }

}

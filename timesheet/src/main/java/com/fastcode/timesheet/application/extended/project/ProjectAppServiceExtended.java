package com.fastcode.timesheet.application.extended.project;

import com.fastcode.timesheet.application.core.project.ProjectAppService;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.timesheet.domain.extended.project.IProjectRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("projectAppServiceExtended")
public class ProjectAppServiceExtended extends ProjectAppService implements IProjectAppServiceExtended {

    public ProjectAppServiceExtended(
        IProjectRepositoryExtended projectRepositoryExtended,
        ICustomerRepositoryExtended customerRepositoryExtended,
        IProjectMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(projectRepositoryExtended, customerRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}

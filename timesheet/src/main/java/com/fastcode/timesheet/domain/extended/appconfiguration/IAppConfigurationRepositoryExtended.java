package com.fastcode.timesheet.domain.extended.appconfiguration;

import com.fastcode.timesheet.domain.core.appconfiguration.IAppConfigurationRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("appConfigurationRepositoryExtended")
public interface IAppConfigurationRepositoryExtended extends IAppConfigurationRepository {
    //Add your custom code here
}

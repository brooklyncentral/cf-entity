package io.cloudsoft.cfentity;

import org.apache.brooklyn.core.annotation.Effector;
import org.apache.brooklyn.core.effector.MethodEffector;
import org.apache.brooklyn.entity.stock.BasicApplication;

public interface CloudFoundryService extends BasicApplication{
	
	MethodEffector<Void> BIND = new MethodEffector<Void>(CloudFoundryService.class, "bind");
	
	MethodEffector<Void> UNBIND = new MethodEffector<Void>(CloudFoundryService.class, "unbind");
	
	@Effector(description="Runs when the service is bound to the Cloud Foundry application")
	void bind();
	
	@Effector(description="Runs when the service is unbound from the Cloud Foundry application")
	void unbind();

}

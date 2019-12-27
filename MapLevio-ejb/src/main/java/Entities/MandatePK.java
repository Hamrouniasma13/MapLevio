package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embeddable;

@Embeddable
public class MandatePK implements Serializable{
	private int projectId;
	private int resourceId;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectId;
		result = prime * result + resourceId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MandatePK other = (MandatePK) obj;
		if (projectId != other.projectId)
			return false;
		if (resourceId != other.resourceId)
			return false;
		return true;
	}
	

}

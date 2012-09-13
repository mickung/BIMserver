package org.bimserver.interfaces.objects;

/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/
import javax.xml.bind.annotation.XmlTransient;
import org.bimserver.shared.meta.*;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SSerializerPluginDescriptor extends SPluginDescriptor implements SBase
{
	private long oid = -1;
	@XmlTransient
	private static SClass sClass;
	
	public long getOid() {
		return oid;
	}
	
	public void setOid(long oid) {
		this.oid = oid;
	}
	
	@XmlTransient
	public SClass getSClass() {
		return sClass;
	}
	
	public static void setSClass(SClass sClass) {
		SSerializerPluginDescriptor.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("defaultName")) {
			return getDefaultName();
		}
		if (sField.getName().equals("pluginClassName")) {
			return getPluginClassName();
		}
		if (sField.getName().equals("description")) {
			return getDescription();
		}
		if (sField.getName().equals("location")) {
			return getLocation();
		}
		if (sField.getName().equals("enabled")) {
			return getEnabled();
		}
		if (sField.getName().equals("defaultExtension")) {
			return getDefaultExtension();
		}
		if (sField.getName().equals("defaultContentType")) {
			return getDefaultContentType();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("defaultName")) {
			setDefaultName((String)val);
			return;
		}
		if (sField.getName().equals("pluginClassName")) {
			setPluginClassName((String)val);
			return;
		}
		if (sField.getName().equals("description")) {
			setDescription((String)val);
			return;
		}
		if (sField.getName().equals("location")) {
			setLocation((String)val);
			return;
		}
		if (sField.getName().equals("enabled")) {
			setEnabled((Boolean)val);
			return;
		}
		if (sField.getName().equals("defaultExtension")) {
			setDefaultExtension((String)val);
			return;
		}
		if (sField.getName().equals("defaultContentType")) {
			setDefaultContentType((String)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.lang.String defaultExtension;
	private java.lang.String defaultContentType;
	public java.lang.String getDefaultExtension() {
		return defaultExtension;
	}

	public void setDefaultExtension(java.lang.String defaultExtension) {
		this.defaultExtension = defaultExtension;
	}
	public java.lang.String getDefaultContentType() {
		return defaultContentType;
	}

	public void setDefaultContentType(java.lang.String defaultContentType) {
		this.defaultContentType = defaultContentType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (oid ^ (oid >>> 32));
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
		SSerializerPluginDescriptor other = (SSerializerPluginDescriptor) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}
/*
 * Copyright (c) 2013, OpenCloudDB/MyCAT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * https://code.google.com/p/opencloudb/.
 *
 */
package io.cdm.config.loader;

import java.util.Map;

import io.cdm.config.model.ClusterConfig;
import io.cdm.config.model.DataHostConfig;
import io.cdm.config.model.DataNodeConfig;
import io.cdm.config.model.FirewallConfig;
import io.cdm.config.model.SchemaConfig;
import io.cdm.config.model.SystemConfig;
import io.cdm.config.model.UserConfig;

/**
 * @author mycat
 */
public interface ConfigLoader {
	SchemaConfig getSchemaConfig(String schema);

	Map<String, SchemaConfig> getSchemaConfigs();

	Map<String, DataNodeConfig> getDataNodes();

	Map<String, DataHostConfig> getDataHosts();

	SystemConfig getSystemConfig();

	UserConfig getUserConfig(String user);

	Map<String, UserConfig> getUserConfigs();

	FirewallConfig getFirewallConfig();

	ClusterConfig getClusterConfig();
}
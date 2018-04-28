/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.cache.spi.support;

import org.hibernate.cache.spi.QueryResultsRegion;
import org.hibernate.cache.spi.RegionFactory;

/**
 * @author Steve Ebersole
 */
public class QueryResultsRegionTemplate extends DirectAccessRegionTemplate implements QueryResultsRegion {
	public QueryResultsRegionTemplate(
			String name,
			RegionFactory regionFactory,
			StorageAccess storageAccess) {
		super( name, regionFactory, storageAccess );
	}
}

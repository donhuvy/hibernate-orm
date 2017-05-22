/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.test.dialect.unit.sequence;

import org.hibernate.dialect.DerbyTenSevenDialect;
import org.hibernate.dialect.Dialect;
import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorLegacyImpl;
import org.hibernate.tool.schema.extract.spi.SequenceInformationExtractor;

import org.hibernate.testing.TestForIssue;

/**
 * @author Andrea Boriero
 */
@TestForIssue(jiraKey = "HHH-11470")
public class DerbyTenSevenDialectSequenceInformationExtractorTest extends AbstractSequenceInformationExtractorTest {
	@Override
	public Dialect getDialect() {
		return new DerbyTenSevenDialect();
	}

	@Override
	public String expectedQuerySequencesString() {
		return "select SEQUENCENAME from SYS.SYSSEQUENCES";
	}

	@Override
	public Class<? extends SequenceInformationExtractor> expectedSequenceInformationExtractor() {
		return SequenceInformationExtractorLegacyImpl.class;
	}
}

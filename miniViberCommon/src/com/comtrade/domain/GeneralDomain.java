package com.comtrade.domain;

import java.sql.ResultSet;
import java.util.List;

public interface GeneralDomain {
	public String getTableName();
	public String getForInsert();
	public String getForUpdate(GeneralDomain gd);
	public String getForDelete(GeneralDomain gd);
	public List<GeneralDomain> editSelect(ResultSet rs);
	public String getForSelect();
	public String getForSelectForSpecific(GeneralDomain u);
}

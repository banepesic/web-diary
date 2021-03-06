package com.brolly.diary.spi;

import com.brolly.diary.service.CrudService;
import com.brolly.diary.service.DiaryEntryCompareService;
import com.brolly.diary.service.impl.CrudServiceImpl;
import com.brolly.diary.service.impl.DiaryEntryCompareServiceImpl;
import com.brolly.diary.utils.DiffSeparator;

public class ServiceFacade {

	//TODO singletone facade
	
	private CrudService crudService;
	
	private DiaryEntryCompareService entryCompareService;
	
	//TODO
	public CrudService getCrudService() {
		if(crudService == null){
			return new CrudServiceImpl();
		}
		return crudService;
	}

	public void setCrudService(CrudService crudService) {
		this.crudService = crudService;
	}

	//TODO
	public DiaryEntryCompareService getEntryCompareService() {
		if(entryCompareService == null){
			return new DiaryEntryCompareServiceImpl(DiffSeparator.EMPTY);
		}
		return entryCompareService;
	}

	public void setEntryCompareService(DiaryEntryCompareService entryCompareService) {
		this.entryCompareService = entryCompareService;
	}
	
	
	
}

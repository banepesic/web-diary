package com.brolly.diary.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.brolly.diary.domain.DiaryEntry;

@Path("entries")
public class DiaryEntryResource extends BaseCommonResource{

	public static final String TEST_MESSAGE = "Hello World!";
	
	@GET
	@Path("test")
	@Produces("text/plain")
	public String testResource() {
		return TEST_MESSAGE;
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public DiaryEntry findById(@PathParam("id") String id) {
		return serviceFacade.getCrudService().findOne(Integer.valueOf(id));//TODO handle Exc
	}
	
	/* http://localhost:8080/web-diary/rest/entries/list */
	@GET
	@Path("/list")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<DiaryEntry> getAllDiaryEntries(){
		return serviceFacade.getCrudService().getAllDiaryEntries();
	}
	
	@POST
	@Path("/save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Integer saveOrUpdateEntry(DiaryEntry entry) {
		return serviceFacade.getCrudService().saveDiaryEntry(entry);
		
	}
	
	@DELETE
	@Path("delete/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteDiaryEntry(@PathParam("id") Integer id){
		serviceFacade.getCrudService().deleteDiaryEntry(id);
	}
	
}

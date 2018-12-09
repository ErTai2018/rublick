package online.rubick.applications.service.rubickImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.rubick.applications.dao.rubick.FilesGroupDropIconMapper;
import online.rubick.applications.entity.rubick.FilesGroupDropIcon;
import online.rubick.applications.service.rubick.FilesGroupDropIconService;

@Service
public class FilesGroupDropIconServiceImpl implements FilesGroupDropIconService{
 
	@Autowired
	private FilesGroupDropIconMapper mapper;

	@Override
	public int save(FilesGroupDropIcon entity) {
		return mapper.insert(entity);
	}

	@Override
	public int delete(String id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int update(FilesGroupDropIcon entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public FilesGroupDropIcon findById(String id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FilesGroupDropIcon> getAll() {
		return mapper.getAll();
	}
	
}
package com.user.micro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.micro.VO.UserVO;
import com.user.micro.VO.UsersListWrapperVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserE saveUser(UserE user) {
		return userRepository.save(user);
	}
	
	public UserE retrieveUser(Integer userID) {
		return userRepository.findById(userID).orElse(null);
	}

	public UsersListWrapperVO retrieveDeptUsers(Integer deptID) {
		
		List<UserE> usersDBObj = userRepository.findByDepartmentID(deptID);
		List<UserE> filteredList = usersDBObj.stream().filter((user) -> user.getDepartmentID().equals(deptID)).collect(Collectors.toList());
		List<UserVO> usersVo = getUserVOList(filteredList);
		UsersListWrapperVO wrapperVo = new UsersListWrapperVO();
		wrapperVo.setUserList(usersVo);
		return wrapperVo;
	}

	private List<UserVO> getUserVOList(List<UserE> usersDBObj) {
		List<UserVO> uservoList = new ArrayList<UserVO>();
		usersDBObj.forEach((userE) -> {
			uservoList.add(new UserVO(userE.getUserID(),userE.getUserName(),
					userE.getDepartmentID()));
		});
		return uservoList;
	}

}

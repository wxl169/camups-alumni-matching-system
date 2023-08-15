package org.wxl.alumniMatching.mapper;

import org.wxl.alumniMatching.domain.entity.Team;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.wxl.alumniMatching.domain.entity.User;
import org.wxl.alumniMatching.domain.vo.UserListVO;
import org.wxl.alumniMatching.domain.vo.UserTagVO;

import java.util.List;

/**
 * <p>
 *  队伍Mapper 接口
 * </p>
 * @author 16956
 */
public interface TeamMapper extends BaseMapper<Team> {

    /**
     *返回参加队伍的成员的信息
     *
     * @param teamUserListId 队伍的主键
     * @return
     */
    List<UserTagVO> getUserList(Long teamUserListId);
}

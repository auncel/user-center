package dev.yidafu.auncel.web.domain.dto;

import dev.yidafu.auncel.web.domain.ContestAccessType;
import dev.yidafu.auncel.web.domain.ContestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ContestRequestDto implements Serializable {
    private long id;

    private String title;

    private String clarification;

    private Date startTime;

    private Date endTime;

    private int timeLimit = 0;

    private ContestStatus status;

    private ContestAccessType access = ContestAccessType.PUBLIC;

    private String invitaionCode;

    private UserDto maker;

    protected long[] problems;

    private Date createdAt;

    private Date updatedAt;
}

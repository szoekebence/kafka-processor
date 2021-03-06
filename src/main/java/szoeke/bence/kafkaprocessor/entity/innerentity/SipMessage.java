package szoeke.bence.kafkaprocessor.entity.innerentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SipMessage {

    public Long Time;
    public String Direction;
    public StartLine StartLine;
    public String Interface;
    public List<NameValuePair<String>> HeaderFields;

}

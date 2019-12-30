package bbejeck.chapter_2.producer;
import java.util.Map;
import org.apache.kafka.common.serialization.Serializer;
import bbejeck.model.PurchaseKey;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PurchaseKeySerializer implements Serializer<PurchaseKey> {

	  @Override
	  public void configure(Map<String, ?> map, boolean b) {

	  }

	  @Override
	  public byte[] serialize(String topic, PurchaseKey data) {
	    byte[] retVal = null;
	    ObjectMapper objectMapper = new ObjectMapper();
	    try {
	      retVal = objectMapper.writeValueAsString(data).getBytes();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return retVal;
	  }

	  @Override public void close() {

	  }

	}
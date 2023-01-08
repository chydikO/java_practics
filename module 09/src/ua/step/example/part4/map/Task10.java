package ua.step.example.part4.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Потеря данных
 *
 */
public class Task10 {
	public static void main(String[] args) {
		Map<Container, String> map = new HashMap<Container, String>();
		Container container = new Container();
		container.valueString = "abc";
		container.valueInt = 5;
		//map.put(container, "test");
		container.valueInt = 3; // FIXME раскоментирую по указанию преподавателя
		System.out.println(map.get(container));
		
		map.put(container, "test1");
		System.out.println(map.get(container));
	}

	static class Container {
		private String valueString;
		private int valueInt;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + valueInt;
			result = prime * result + ((valueString == null) ? 0 : valueString.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Container other = (Container) obj;
			if (valueInt != other.valueInt)
				return false;
			if (valueString == null) {
				if (other.valueString != null)
					return false;
			} else if (!valueString.equals(other.valueString))
				return false;
			return true;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Container [valueString=").append(valueString).append(", valueInt=").append(valueInt)
					.append("]");
			return builder.toString();
		}
	}
}

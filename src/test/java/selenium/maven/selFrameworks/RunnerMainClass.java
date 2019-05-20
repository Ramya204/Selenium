package selenium.maven.selFrameworks;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

import org.junit.runner.JUnitCore;

public class RunnerMainClass {

	public static void main(String[] args) {
		Result rc = JUnitCore.runClasses(FacebookTest.class);
		System.out.println("ignoreCount"+rc.getIgnoreCount());
		System.out.println("faile count"+rc.getFailureCount());
		System.out.println("runtime"+rc.getRunTime());
		System.out.println("run count"+rc.getRunCount());
		List<Failure> failures = rc.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}

	}

}

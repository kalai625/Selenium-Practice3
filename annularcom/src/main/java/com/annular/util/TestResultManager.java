package com.annular.util;

import static com.annular.util.AnnulartechDriver.fileName;

import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.annular.testRailConfig.APIClient;

public class TestResultManager {

	public static final String ENDPOINT = "https://jira.acos.no/"; // your jira server URL
	public static final String TM4J_RESULT_ENDPOINT = "rest/atm/1.0/testrun/";
	public static final String Template = "resources/TM4J_Template/tm4j_create_execution.json";

	private String testCycleID;
	private String testManagerTool;
	private String testCaseID;
	private JsonObject reqBody;
	public static final String testResultCommonMessage = "Testcase Successfully Executed";

	public static final String RAILS_ENGINE_URL = "https://rainfall.testrail.io/";
	public static final String userName = "support@rainfall.no";
	public static final String passWord = "Rainfall2021!";

	public static final String JIRAEndPoint = "https://api.adaptavist.io/tm4j/v2/testexecutions/";
	public static final String JIRABearerToken = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODc4ODM0My0zMTEyLTNmMDUtODg2My03Zjc3OGJjOWE4NTkiLCJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczpcL1wvY29uc3VsdGl0c2VydmljZXMuYXRsYXNzaWFuLm5ldCIsInVzZXIiOnsiYWNjb3VudElkIjoiNWRkYzBiY2MyZmQ2MjYwY2YyN2MzMWFiIn19LCJpc3MiOiJjb20ua2Fub2FoLnRlc3QtbWFuYWdlciIsImV4cCI6MTYzNDczNzI3MSwiaWF0IjoxNjAzMjAxMjcxfQ.6IsrnCpWJMqu0aF0TVtUc_t9i3eyVxhSZlXcsPKvDQ8";

	/**
	 * This method is used to get the testCycle ID from configuration property file.
	 * 
	 * @param testCycleID2
	 */
	public TestResultManager(String testCycleID, String testManager) {

		this.testCycleID = testCycleID;
		this.testManagerTool = testManager;
		try {
			this.reqBody = new Gson().fromJson(IOUtils.toString(new FileReader((Template))), JsonObject.class);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to set testcaseID
	 * 
	 * @param testcaseID
	 */
	public void setTestcaseID(String testcaseID) {
		this.testCaseID = testcaseID;
	}

	/**
	 * This method is used to retrieve testcaseID from TestSuite Initialization
	 * Class
	 * 
	 * @return
	 */
	public String getTestCaseID() {
		return testCaseID;
	}

	/**
	 * This method is used to retrieve testCycle ID from TestSuite Initialization
	 * Class
	 * 
	 * @return
	 */
	public String getTestCycleID() {
		return testCycleID;
	}

	public String getTestManager() {
		return testManagerTool;
	}

	/**
	 * This method is used to retrieve get request Payload from TestSuite
	 * Initialization Class
	 * 
	 * @return
	 */
	public JsonObject getReqPayload() {
		return reqBody;
	}

	/**
	 * This method is used to set status from TestSuite Initialization Class
	 * 
	 * @param status
	 * @return
	 */
	public TestResultManager setStatus(String status) {
		getReqPayload().addProperty("status", status);
		getReqPayload().get("scriptResults").getAsJsonArray().get(0).getAsJsonObject().addProperty("status", status);
		return this;
	}

	/**
	 * This method is used to retrieve comment from TestSuite Initialization Class
	 * 
	 * @param comment
	 * @return
	 */
	public TestResultManager setComment(String comment) {
		getReqPayload().addProperty("comment", comment);
		return this;
	}

	/**
	 * This method is used to retrieve Actual Result comments
	 * 
	 * @param arc
	 * @param exectime
	 * @return
	 */
	public TestResultManager setActualResultComment(String arc, long exectime) {
		getReqPayload().get("scriptResults").getAsJsonArray().get(0).getAsJsonObject().addProperty("comment", arc);
		getReqPayload().getAsJsonObject().addProperty("executionTime", exectime);
		return this;
	}

	/**
	 * This method is used to update Test Result to JIRA server. If its a fail,
	 * screenshot will also be sent
	 * 
	 * @return8
	 * @throws UnsupportedOperationException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public TestResultManager updateTestResult(String TcDescription, String status, String commentToBeUpdated)
			throws Exception {

		if (getTestManager().contains("JIRA")) {
			if (status.contains("Pass")) {
				try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
					HttpPost httpPost = new HttpPost(JIRAEndPoint);
					httpPost.setHeader("Accept", "application/json");
					httpPost.setHeader("Content-type", "application/json");
					httpPost.setHeader("Authorization",
							"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODc4ODM0My0zMTEyLTNmMDUtODg2My03Zjc3OGJjOWE4NTkiLCJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczpcL1wvY29uc3VsdGl0c2VydmljZXMuYXRsYXNzaWFuLm5ldCIsInVzZXIiOnsiYWNjb3VudElkIjoiNWRkYzBiY2MyZmQ2MjYwY2YyN2MzMWFiIn19LCJpc3MiOiJjb20ua2Fub2FoLnRlc3QtbWFuYWdlciIsImV4cCI6MTYzNDczNzI3MSwiaWF0IjoxNjAzMjAxMjcxfQ.6IsrnCpWJMqu0aF0TVtUc_t9i3eyVxhSZlXcsPKvDQ8");
					String json = "{\r\n\"projectKey\": \"IAUT\",\r\n\"testCaseKey\": \""
							+ getTestCaseID().replace("_", "-") + "\",\r\n\"testCycleKey\": \"" + getTestCycleID()
							+ "\",\r\n\"statusName\": \"Pass\",\r\n\"comment\": \"Test Passed with no issues.\"\r\n}";
					StringEntity stringEntity = new StringEntity(json);
					httpPost.setEntity(stringEntity);
					httpclient.execute(httpPost);
				}
			} else {
				try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
					HttpPost httpPost = new HttpPost(JIRAEndPoint);
					httpPost.setHeader("Accept", "application/json");
					httpPost.setHeader("Content-type", "application/json");
					httpPost.setHeader("Authorization",
							"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODc4ODM0My0zMTEyLTNmMDUtODg2My03Zjc3OGJjOWE4NTkiLCJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczpcL1wvY29uc3VsdGl0c2VydmljZXMuYXRsYXNzaWFuLm5ldCIsInVzZXIiOnsiYWNjb3VudElkIjoiNWRkYzBiY2MyZmQ2MjYwY2YyN2MzMWFiIn19LCJpc3MiOiJjb20ua2Fub2FoLnRlc3QtbWFuYWdlciIsImV4cCI6MTYzNDczNzI3MSwiaWF0IjoxNjAzMjAxMjcxfQ.6IsrnCpWJMqu0aF0TVtUc_t9i3eyVxhSZlXcsPKvDQ8");
					String json = "{\r\n\"projectKey\": \"IAUT\",\r\n\"testCaseKey\": \""
							+ getTestCaseID().replace("_", "-") + "\",\r\n\"testCycleKey\": \"" + getTestCycleID()
							+ "\",\r\n\"statusName\": \"Fail\",\r\n\"comment\": \"Test Failed with issues.\"\r\n}";
					StringEntity stringEntity = new StringEntity(json);
					httpPost.setEntity(stringEntity);

					System.out.println("Executing request " + httpPost.getRequestLine());
					httpclient.execute(httpPost);
				}

			}
		} else if (getTestManager().contains("TestRail")) {

			if (status.contains("Pass")) {
				APIClient client = new APIClient(RAILS_ENGINE_URL);
				client.setUser("support@rainfall.no");
				client.setPassword("Rainfall2021!");
				Map data = new HashMap();
				data.put("status_id", 1);
				data.put("comment", "Test Executed - This case is Passed");
				System.out.println(getTestCycleID());
				client.sendPost("add_result_for_case/" + getTestCycleID() + "/" + getTestCaseID() + "", data);
			} else {
				APIClient client = new APIClient(RAILS_ENGINE_URL);
				client.setUser("support@rainfall.no");
				client.setPassword("Rainfall2021!");
				Map data = new HashMap();
				data.put("status_id", 5);
				data.put("comment", commentToBeUpdated);
				client.sendPost("add_result_for_case/" + getTestCycleID() + "/" + getTestCaseID() + "", data);

				Object a = client.sendGet("get_results_for_case/" + getTestCycleID() + "/" + getTestCaseID() + "");
				String b = a.toString();
				String ExecutionId = b.substring(b.indexOf("\"id\"") + 5, b.indexOf(",\"version"));

				client.sendPost("add_attachment_to_result/" + ExecutionId + "", fileName);

			}
		}

		return this;

	}

}
import {GEMINI_API_KEY} from "./apikey.js";
import { GoogleGenAI, Type } from "@google/genai";

const ai = new GoogleGenAI({ apiKey: GEMINI_API_KEY });
console.log(GEMINI_API_KEY);

async function extractProfileData() {
     const messyText = `
    Hey there! My name is Hariom. I'm a software engineer aspirant who has been 
    focusing entirely on backend engineering for the last 2 years. I spend most of 
    my days writing Java, building microservices with Spring Boot, and tweaking 
    complex SQL queries. Right now, I'm diving heavily into Data Structures and 
    Algorithms to prep for upcoming technical exams.
  `;

     try {
          // 2. Call the Gemini API using the fast, cost-effective flash model
          const response = await ai.models.generateContent({

               model: "gemini-2.5-flash",
               contents: `Extract professional profile details from this text: ${messyText}`,
               config: {
                    // Enforce JSON output format
                    responseMimeType: "application/json",
                    // Pass the schema definition structure
                    responseSchema: {
                         type: Type.OBJECT,
                         properties: {
                              name: { type: Type.STRING },
                              yearsOfExperience: { type: Type.INTEGER },
                              primaryLanguage: { type: Type.STRING },
                              coreFrameworks: {
                                   type: Type.ARRAY,
                                   items: { type: Type.STRING },
                              },
                              currentFocus: { type: Type.STRING },
                         },
                         required: ["name", "yearsOfExperience", "primaryLanguage", "coreFrameworks"],
                    },
               },
          });

          // 3. Parse and log the structured JSON result
          const profileJson = JSON.parse(response.text);
          console.log("Successfully parsed JSON Object:");
          console.log(profileJson);

          // You can now access properties directly:
          // console.log(`Welcome back, ${profileJson.name}!`);

     } catch (error) {
          console.error("Error generating or parsing content:", error);
     }
}

extractProfileData();


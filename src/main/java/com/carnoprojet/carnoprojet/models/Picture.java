package com.carnoprojet.carnoprojet.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
 
	private String Name;

	private int Size;

	private String ContentType;

	private String ContentBase64;

	private byte[] ContentBytes;
}

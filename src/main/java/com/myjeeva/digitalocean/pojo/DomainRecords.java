/**
 * The MIT License
 * 
 * Copyright (c) 2013-2018 Jeevanandam M. (myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.myjeeva.digitalocean.pojo;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.google.gson.annotations.SerializedName;

/**
 * Represents Domain Records attributes
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.0
 */
public class DomainRecords extends Base {

  private static final long serialVersionUID = -3070769129688315651L;

  @SerializedName("domain_records")
  private List<DomainRecord> domainRecords;

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * @return the domainRecords
   */
  public List<DomainRecord> getDomainRecords() {
    return domainRecords;
  }

  /**
   * @param domainRecords the domainRecords to set
   */
  public void setDomainRecords(List<DomainRecord> domainRecords) {
    this.domainRecords = domainRecords;
  }
}

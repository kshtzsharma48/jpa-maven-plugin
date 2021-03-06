/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil -*-
 *
 * $Id$
 *
 * Copyright (c) 2010-2011 Edugility LLC.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense and/or sell copies
 * of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THIS SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT.  IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 * The original copy of this license is available at
 * http://www.opensource.org/license/mit-license.html.
 */
package com.edugility.jpa.maven.plugin;

import java.io.File;
import java.io.IOException;

 /**
  * An {@link IOException} that results from a {@link File} failing
  * validation of some kind.
  *
  * @author <a href="mailto:ljnelson@gmail.com">Laird Nelson</a>
  *
  * @version 1.0-SNAPSHOT
  *
  * @since 1.0-SNAPSHOT
  *
  * @see DirectoryException
  */
public abstract class FileException extends IOException {

  /**
   * The {@link File} that failed validation.  This field may be
   * {@code null}.
   */
  private final File file;

  /**
   * Creates a new {@link FileException}.
   *
   * @param file the {@link File} whose validation failure caused this
   * {@link FileException} to be thrown; may be {@code null}
   */
  protected FileException(final File file) {
    this(file, (Throwable)null, (String)null);
  }

  /**
   * Creates a new {@link FileException}.
   *
   * @param file the {@link File} whose validation failure caused this
   * {@link FileException} to be thrown; may be {@code null}
   *
   * @param message a detail message further explaining this {@link
   * FileException}; may be {@code null}
   */
  protected FileException(final File file, final String message) {
    this(file, (Throwable)null, message);
  }

  /**
   * Creates a new {@link FileException}.
   *
   * @param file the {@link File} whose validation failure caused this
   * {@link FileException} to be thrown; may be {@code null}
   *
   * @param cause the {@link Throwable} that contributed to this
   * {@link FileException}'s cause; may be {@code null}
   *
   * @param message a detail message further explaining this {@link
   * FileException}; may be {@code null}
   */
  protected FileException(final File file, final Throwable cause, final String message) {
    super(message, cause);
    this.file = file;
  }

  /**
   * Returns the {@link File} whose validation failure caused this
   * {@link FileException} to be thrown.
   *
   * <p>This method may return {@code null}.</p>
   *
   * @return the {@link File} whose validation failure caused this
   * {@link FileException} to be thrown, or {@code null}
   */
  public File getFile() {
    return this.file;
  }

}
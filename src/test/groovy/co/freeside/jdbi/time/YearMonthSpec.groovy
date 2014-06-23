/*
 * Copyright 2014 Rob Fletcher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.freeside.jdbi.time

import java.time.YearMonth
import org.skife.jdbi.v2.tweak.ResultSetMapper

class YearMonthSpec extends MapsToStringSpecification<YearMonth> {

  @Override
  protected Class<YearMonth> targetType() {
    YearMonth
  }

  @Override
  protected ResultSetMapper<YearMonth> targetTypeMapperFor(String name) {
    new YearMonthMapper(name)
  }

  @Override
  protected ResultSetMapper<YearMonth> targetTypeMapperForFirst() {
    YearMonthMapper.FIRST
  }

  @Override
  protected YearMonth targetValue() {
    YearMonth.now(fixedClock)
  }
}

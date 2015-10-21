cf-entity
===

[![Join the chat at https://gitter.im/brooklyncentral/cf-entity](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/brooklyncentral/cf-entity?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

This is a Sample Brooklyn project, showing how to define an application
which Brooklyn will deploy and manage.

This sample project is intended to be customized to suit your purposes: but
search for all lines containing the word "sample" to make sure all the
references to this being a sample are removed!   

To build an assembly, simply run:

    mvn clean assembly:assembly

This creates a tarball with a full standalone application which can be installed in any *nix machine at:
    target/cf-entity-0.1.0-SNAPSHOT-dist.tar.gz

It also installs an unpacked version which you can run locally:
 
     cd target/cf-entity-0.1.0-SNAPSHOT-dist/cf-entity-0.1.0-SNAPSHOT
     ./start.sh server
 
For more information see the README (or `./start.sh help`) in that directory.
On OS X and Linux, this application will deploy to localhost *if* you have key-based 
password-less (and passphrase-less) ssh enabled.

To configure cloud and fixed-IP locations, see the README file in the built application directly.
For more information you can run `./start.sh help`) in that directory.


### Opening in an IDE

To open this project in an IDE, you will need maven support enabled
(e.g. with the relevant plugin).  You should then be able to develop
it and run it as usual.  For more information on IDE support, visit:

    https://brooklyn.incubator.apache.org/v/latest/dev/env/ide/


### Customizing the Assembly

The artifacts (directory and tar.gz by default) which get built into
`target/` can be changed.  Simply edit the relevant files under
`src/main/assembly`.

You will likely wish to customize the `SampleMain` class as well as
the `Sample*App` classes provided.  That is the intention!
You will also likely want to update the `start.sh` script and
the `README.*` files.

To easily find the bits you should customize, do a:

    grep -ri sample src/ *.*


### More About Apache Brooklyn

Apache Brooklyn is a code library and framework for managing applications in a 
cloud-first dev-ops-y way.  It has been used to create this sample project 
which shows how to define an application and entities for Brooklyn.

This project can be extended for more complex topologies and more 
interesting applications, and to develop the policies to scale or tune the 
deployment depending on what the application needs.

For more information consider:

* Visiting the Apache Brooklyn home page at https://brooklyn.incubator.apache.org
* Finding us on IRC #brooklyncentral or email (click "Community" at the site above) 
* Forking the project at  http://github.com/apache/incubator-brooklyn/

A sample Brooklyn project should specify its license.

================

© 2015 Cloudsoft Corporation Limited.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. The licence is provided in LICENSE.md, and you may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

package de.customed.plugins.api;

import org.pf4j.ExtensionPoint;

/**
 * Export destination invoked by the server export task. An implementation is
 * discovered through PF4J and must have a public no-argument constructor.
 * The server selects active extensions through their ExtensionDescriptor;
 * implementations do not need a separate enabled check.
 */
public interface ServerExport extends ExtensionPoint {

    /** Return true only after the destination has accepted the export. */
    boolean export(ServerExportContext context) throws Exception;
}

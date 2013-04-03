package edu.umass.ciir.kbbridge.data

import edu.umass.ciir.kbbridge.nlp.NlpData.NlpXmlNerMention

/**
 * User: jdalton
 * Date: 3/29/13
 */
abstract class EntityMention(val docId:String, val entityType:String, val mentionId:String, val entityName:String, val corefChain:Seq[NlpXmlNerMention]=Seq()) {

def fullText:String
}

case class SimpleEntityMention(override val docId: String, override val entityType: String, override val mentionId: String,
override val entityName: String,  override val fullText:String, override val corefChain: Seq[NlpXmlNerMention] = Seq())
extends EntityMention(docId, entityType, mentionId, entityName, corefChain)